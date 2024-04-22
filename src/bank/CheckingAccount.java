package bank;

//CheckingAccount.java
public class CheckingAccount extends Bank {
 private double interestRate;

 public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
     super(firstName, lastName, accountID, interestRate);
     this.interestRate = interestRate;
 }

 public void processWithdrawal(double amount) {
     if (amount > 0 && balance >= amount) {
         super.withdrawal(amount);
     } else if (amount > 0 && balance - amount >= -30) {
         super.withdrawal(amount + 30); // Charge $30 overdraft fee
         System.out.println("Overdraft fee charged: $30");
     } else {
         System.out.println("Insufficient funds or invalid amount for withdrawal.");
     }
 }

 public void displayAccount() {
     super.accountSummary();
     System.out.println("Interest Rate: " + interestRate);
 }
}
