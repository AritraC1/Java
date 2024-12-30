package Projects.BankAccountManagementSystem;

import javax.naming.InsufficientResourcesException;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // constructors
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // getter and setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        balance = balance + amount;
    }

    public void withdraw(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }

        if (amount > balance){
            throw new InsufficientFundsException("Insufficient funds");
        }

        balance = balance - amount;
    }

    @Override
    public String toString(){
        return "Account Number: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $" + balance;
    }
}
