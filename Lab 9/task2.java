public class task2 {
    // Private fields
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public task2(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Setter methods
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to show account information securely
    public void ShowAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + maskAccountNumber());
        System.out.println("Balance: $" + balance);
    }

    // Private helper method to mask the account number
    private String maskAccountNumber() {
        if (accountNumber.length() > 4) {
            String last4 = accountNumber.substring(accountNumber.length() - 4);
            return "**** **** **** " + last4;
        } else {
            return "****";
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "123456789012", 1500.00);
        account.ShowAccountInfo();
    }
}
