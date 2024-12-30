package Projects.BankAccountManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class BankSystem {
    private HashMap<String, BankAccount> accounts;

    // Constructor to initialise accounts list
    public BankSystem() {
        accounts = new HashMap<>();
    }

    // Add account
    public void addAccount(String accountNumber, String accountHolder, double initialBalance){
        BankAccount bankAccount = new BankAccount(accountNumber, accountHolder, initialBalance);
        accounts.put(accountNumber, bankAccount);
    }

    // Deposit money into account
    public void depositMoney(String accountNumber, double amount){
        BankAccount bankAccount = accounts.get(accountNumber);

        if (bankAccount != null){
            bankAccount.deposit(amount);
        }
        else {
            throw new IllegalArgumentException("Account not found");
        }
    }

    // Withdraw money from account
    public void withdrawAmount(String accountNumber, double amount){
        BankAccount bankAccount = accounts.get(accountNumber);
        if (bankAccount != null) {
            bankAccount.withdraw(amount);
        } else {
            throw new IllegalArgumentException("Account not found.");
        }
    }

    // Display account details
    public void displayAccount(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Save account data to a file
    public void saveAccountsToFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (BankAccount account : accounts.values()) {
                writer.write(account.getAccountNumber() + "," + account.getAccountHolder() + "," + account.getBalance());
                writer.newLine();
            }
        }
    }

    // Load account data from file
    public void loadAccountsFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String accountNumber = data[0];
                String accountHolder = data[1];
                double balance = Double.parseDouble(data[2]);
                addAccount(accountNumber, accountHolder, balance);
            }
        }
    }

    // Searching account by account number
    public BankAccount searchAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    // Sorting accounts by balance in descending order
    public List<BankAccount> sortAccountsByBalance() {
        List<BankAccount> accountList = new ArrayList<>(accounts.values());
        accountList.sort(Comparator.comparingDouble(BankAccount::getBalance).reversed());
        return accountList;
    }
}
