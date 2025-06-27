// Interface definition
interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}

// DBBL class implementing ATMService
class DBBL implements ATMService {
    private double balance;

    // Constructor
    public DBBL(double initialBalance) {
        this.balance = initialBalance;
    }

    // Implement withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Implement deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Implement checkBalance method
    @Override
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        DBBL myAccount = new DBBL(1000.00);

        myAccount.checkBalance();
        myAccount.deposit(500.00);
        myAccount.withdraw(300.00);
        myAccount.checkBalance();
    }
}
