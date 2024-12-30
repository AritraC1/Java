package Projects.BankAccountManagementSystem;

public class BankUser implements Runnable{
    private BankSystem bankSystem;
    private String accountNumber;
    private String operation;
    private double amount;

    public BankUser(BankSystem bankSystem, String accountNumber, String operation, double amount) {
        this.bankSystem = bankSystem;
        this.accountNumber = accountNumber;
        this.operation = operation;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            if ("deposit".equals(operation)) {
                bankSystem.depositMoney(accountNumber, amount);
                System.out.println("Deposited $" + amount + " to account " + accountNumber);
            } else if ("withdraw".equals(operation)) {
                bankSystem.withdrawAmount(accountNumber, amount);
                System.out.println("Withdrew $" + amount + " from account " + accountNumber);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();
        bankSystem.addAccount("A101", "John Doe", 5000.0);

        Thread t1 = new Thread(new BankUser(bankSystem, "A101", "deposit", 2000));
        Thread t2 = new Thread(new BankUser(bankSystem, "A101", "withdraw", 1500));

        t1.start();
        t2.start();
    }
}
