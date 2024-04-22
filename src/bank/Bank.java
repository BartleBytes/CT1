package bank;

public class Bank {
	private String firstName;
	private String lastName;
	private int accountId;
	protected double balance;
	
	// Constructor
	public Bank(String firstName, String lastName, int accountId, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountId = accountId;
		this.balance = 0.0;
	}
	
	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit of $" + amount + " successful. New balance: $ " + balance);
		}
	}
	// Withdrawal method
	public void withdrawal(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
		} else {
			System.out.println("Insufficient funds or invalid withdrawal amount");
		}
	}
	// Getters and Setters

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void accountSummary() {
		System.out.println("Account Holder: " + firstName + " " + lastName);
		System.out.println("Account ID:" + accountId);
		System.out.println("Balance: $" + balance);
	}
}

