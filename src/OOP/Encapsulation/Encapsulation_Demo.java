package OOP.Encapsulation;

// 1. The Encapsulated Class
class BankAccount {
    // Private variables: Cannot be accessed directly from outside this class
    private String accountHolder;
    private double balance;

    // Constructor to initialize data
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Validation during initialization
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Getter Method: Controlled read-only access for 'balance'
    public double getBalance() {
        return this.balance;
    }

    // Getter Method: Controlled read-only access for 'accountHolder'
    public String getAccountHolder() {
        return this.accountHolder;
    }

    // Setter Method: Controlled write-only access for 'accountHolder'
    public void setAccountHolder(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.accountHolder = newName;
        }
    }

    // Controlled Business Method: Deposits money safely with validation
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Controlled Business Method: Withdraws money safely with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

// 2. The Testing Class
public class Encapsulation_Demo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 500.00);

        // COMPILER ERROR: Direct access is blocked because variables are private
        // account.balance = -10000.00;
        // account.accountHolder = "";

        // Interact safely via public methods
        account.deposit(150.00);
        account.withdraw(100.00);

        // Read data via getters
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Final Balance: $" + account.getBalance());

        // Attempting an illegal operation handled by validation logic
        account.withdraw(1000.00);
    }
}