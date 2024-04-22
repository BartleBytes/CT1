package bank;

//TestBankAccount.java
public class TestBankAccount {
 public static void main(String[] args) {
     // Creating a CheckingAccount object
     CheckingAccount account = new CheckingAccount("Dylan", "Bartle", 123456, 0.05);

     // Depositing and withdrawing money
     account.deposit(500);
     account.processWithdrawal(530); // Overdraft withdrawal
     account.processWithdrawal(200);

     // Displaying account information
     account.displayAccount();
 }
}
