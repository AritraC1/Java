package Projects.BankAccountManagementSystem;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BankSystem bankSystem = new BankSystem();

        // Adding accounts
        bankSystem.addAccount("A101", "John Doe", 1000);
        bankSystem.addAccount("A102", "Jane Smith", 2000);

        // Displaying account details
        bankSystem.displayAccount("A101");

        // Deposit and Withdraw
        bankSystem.depositMoney("A101", 500);
        bankSystem.withdrawAmount("A102", 300);

        // Display updated account
        bankSystem.displayAccount("A101");
        bankSystem.displayAccount("A102");

        // Save accounts to file
        bankSystem.saveAccountsToFile("accounts.txt");

        // Load accounts from file
        BankSystem loadedSystem = new BankSystem();
        loadedSystem.loadAccountsFromFile("accounts.txt");
        loadedSystem.displayAccount("A101");

        // Sorting accounts by balance
        List<BankAccount> sortedAccounts = bankSystem.sortAccountsByBalance();
        sortedAccounts.forEach(System.out::println);
    }
}

