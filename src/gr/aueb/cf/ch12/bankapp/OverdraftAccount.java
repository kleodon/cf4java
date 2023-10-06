package gr.aueb.cf.ch12.bankapp;

/**
 * The OverdraftAccount class represents a bank account
 * with the ability to withdraw amounts that exceed
 * the account's balance up to 1000
 */
public class OverdraftAccount {
    static final double OVERDRAFT_LIMIT = 1000;

    private final AccountHolder holder;
    private final String iban;
    private double balance;

    // Constructors
    public OverdraftAccount(Long id, String iban, String firstname, String lastname, String ssn, double balance) {
        holder = new AccountHolder(id, firstname, lastname, ssn);
        this.iban = iban;
        this.balance = balance;
    }

    public OverdraftAccount(AccountHolder holder, String iban, double balance) {
        this.holder = holder;
        this.iban = iban;
        this.balance = balance;
    }

    // Getters and Setters
    public String getIban() {
        return iban;
    }
    public AccountHolder getHolder() { return holder; }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


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
            if (amount > ( balance + OVERDRAFT_LIMIT ) ){
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
        return holder.convertToString() + ", "
                + iban + ", "
                + String.format("%.2f", balance);
    }


    // Private methods
    private boolean isSsnValid(String ssn) {
        return holder.getSsn().equals(ssn);
    }
}
