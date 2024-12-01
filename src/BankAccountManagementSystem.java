import java.util.*;

class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor for default account
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = "Savings"; // Default account type
        this.balance = 1000.0; // Default initial balance
    }

    // Constructor for custom account
    public BankAccount(String accountHolderName, String accountNumber, String accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("-------------------------------------");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------------------");
    }
}


public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Account Management System!");
        System.out.println("Choose an option:");
        System.out.println("1. Create a default account");
        System.out.println("2. Create a custom account");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            // Default account creation
            System.out.println("Enter Account Holder Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Account Number:");
            String accountNumber = scanner.nextLine();

            BankAccount defaultAccount = new BankAccount(name, accountNumber);
            System.out.println("Default Account Created Successfully!");
            defaultAccount.displayAccountDetails();
        } else if (choice == 2) {
            // Custom account creation
            System.out.println("Enter Account Holder Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Account Number:");
            String accountNumber = scanner.nextLine();
            System.out.println("Enter Account Type (Savings/Current):");
            String accountType = scanner.nextLine();
            System.out.println("Enter Initial Balance:");
            double balance = scanner.nextDouble();

            BankAccount customAccount = new BankAccount(name, accountNumber, accountType, balance);
            System.out.println("Custom Account Created Successfully!");
            customAccount.displayAccountDetails();
        } else {
            System.out.println("Invalid choice! Exiting...");
        }

        scanner.close();
    }
}
