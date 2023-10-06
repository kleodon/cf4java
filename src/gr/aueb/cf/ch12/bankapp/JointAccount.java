package gr.aueb.cf.ch12.bankapp;

/**
 * The JointAccount class represents a bank account
 * with two holders
 */
public class JointAccount {

    private AccountHolder[] holders = new AccountHolder[2];
    private final String iban;
    private double balance;

    // Constructors
//    public JointAccount(Long id, String iban, String firstname, String lastname, String ssn, double balance) {
//        holders[1] = new AccountHolder(id, firstname, lastname, ssn);
//        this.iban = iban;
//        this.balance = balance;
//    }

    public JointAccount(AccountHolder[] holders, String iban, double balance) {
        this.holders = holders;
        this.iban = iban;
        this.balance = balance;
    }

    public JointAccount(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    // Getters and Setters
    public String getIban() {
        return iban;
    }
    public AccountHolder[] getHolders() { return holders; }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setFirstHolder(AccountHolder holder){ holders[0] = holder; }
    public AccountHolder getFirstHolder(){ return holders[0]; }
    public void setSecondHolder(AccountHolder holder){ holders[1] = holder; }
    public AccountHolder getSecondHolder(){ return holders[1]; }



    // Public API
    /**
     * Deposits a certain amount of money.
     *
     * @param amount
     *          the amount of money to be deposited.
     * @throws Exception
     *          if the amount is negative.
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Negative amount exception");
            }
            balance += amount;
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws an amount of money based on
     * a valid ssn.
     *
     * @param amount
     *          the amount to be withdrawn.
     * @param ssn
     *          the given ssn.
     * @throws Exception
     *          if the ssn is not valid or
     *          the overdraft limit has been exceeded.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn not valid exception");
            }
            if (amount > balance ){
                throw new Exception("The overdraft limit has been exceeded");
            }
            balance -= amount;
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the account.
     *
     * @return
     *      the account's balance.
     */
    public double getAccountBalance() {
        return getBalance();
        // return balance;
    }

    /**
     * Returns the account's state in string format.
     *
     * @return
     *      the string-representation of the state of the account.
     */
    public String convertToString() {
        StringBuilder state = new StringBuilder();

        state.append(iban + ", " + String.format("%.2f", balance));

        if (holders[0] != null){
            state.append( ", " + "First Holder(" + holders[0].convertToString() + ")" );
        }
        if (holders[1] != null){
            state.append( ", " + "Second Holder(" + holders[1].convertToString() + ")" );
        }
        return state.toString();
    }


    // Private methods
    private boolean isSsnValid(String ssn) {
        for( AccountHolder holder: holders ) {
            if ( holder.getSsn().equals(ssn) ){
                return true;
            }
        }
        return false;
    }
}
