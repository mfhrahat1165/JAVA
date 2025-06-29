public class task2 {
public static void main(String[] args) {
     BankAccount MFHS = new BankAccount(); 
     MFHS.setAccountHolder(" Md Fahamid Haque Rahat "); 
     MFHS.setAccountNumber("9874243555");
     MFHS.setBalance(5000.00);

MFHS.displayAccountInfo();
}
}

class BankAccount {
private String accountHolder;
private String accountNumber; 
private double balance;

public void setAccountHolder(String accountHolder) 
{
      this.accountHolder = accountHolder;
}

public void setAccountNumber(String accountNumber) 
{
      this.accountNumber = accountNumber;
}

public void setBalance(double balance) 
{
      this.balance = balance;
}

public void displayAccountInfo() 
{
      System.out.println("Account Holder: " + accountHolder);
       System.out.println("Account Number: " + accountNumber); 
       System.out.println("Balance: " + balance);
}
}
