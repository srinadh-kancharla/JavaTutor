package main;

class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        // Prevent negative balance
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Balance set to 0.");
        }
    }

    // Getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter only for account holder name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }
}

public class BankMag {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(
                123456789012L,
                "Srinadh",
                0
        );

        System.out.println("Account Number : " + b1.getAccountNumber());
        System.out.println("Account Holder : " + b1.getAccountHolderName());
        System.out.println("Balance : ₹" + b1.getBalance());

        b1.deposit(2000);
        b1.withdraw(3000);

        System.out.println("Updated Balance : ₹" + b1.getBalance());

        b1.setAccountHolderName("Sai Srinadh");
        System.out.println("New Account Holder : " + b1.getAccountHolderName());
    }
}