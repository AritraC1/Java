package Projects.BankAccountManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private String customerName;
    private double balance;
    private String accountType;
    private List<Transaction> transactions;

    // Constructors

    public Account(int accountNumber, String customerName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.accountType = accountType;
        this.transactions = new ArrayList<>();
    }

    // Methods
    public void deposit(double amount){
        if (amount > 0){
            balance = balance + amount;
            transactions.add(new Transaction("Deposit", amount, "Successful deposit"));
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount, "Successful withdrawal"));
            return true;
        }
        return false;
    }

    public String getAccountDetails(){
        return "Account No: " + accountNumber + ", Name: " + customerName +
                ", Balance: " + balance + ", Type: " + accountType;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

