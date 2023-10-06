package gr.aueb.cf.ch12.bankapp;

/**
 * Driver class for {@link JointAccount} and {@link OverdraftAccount}
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Testing OverdraftAccount class");
        OverdraftAccount overdraftAccount = new OverdraftAccount(1L,"GR12345","Nick","Rigas","R12345",5000);

        System.out.println(overdraftAccount.convertToString() + "-> Initial state");
        try {
            System.out.println("Deposit 200");
            overdraftAccount.deposit(200);
            System.out.println(overdraftAccount.convertToString() + "-> State after deposit");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Withdraw 200 using ssn R2345 ");
            overdraftAccount.withdraw(200,"R2345");
            System.out.println(overdraftAccount.convertToString() + "-> State after withdraw");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Withdraw 200 using ssn R12345");
            overdraftAccount.withdraw(5800,"R12345");
            System.out.println(overdraftAccount.convertToString() + "-> State after withdraw");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println();

        System.out.println("Testing OverdraftAccount class");

        AccountHolder holderA = new AccountHolder(2L, "Antonis","Papadopoulos","P54321");
        AccountHolder holderB = new AccountHolder(3L, "Giorgos","Georgiou","G8888");
        JointAccount jointAccount = new JointAccount("GR5321",8000);

        System.out.println(jointAccount.convertToString() + "-> Initial state");

        jointAccount.setFirstHolder(holderA);
        System.out.println(jointAccount.convertToString() + "-> Holder 1");

        jointAccount.setSecondHolder(holderB);
        System.out.println(jointAccount.convertToString() + "-> Holder 2");

    }
}
