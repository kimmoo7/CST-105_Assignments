package chapter9;

public class Number_Seven {

	public static void main(String[] args) {
		/* Design a class named Account. Write a test program that creates an Account 
		  object with an account ID of 1122, a balance of $20,000, and an annual interest
		  rate of 4.5%. Use the withdraw method to withdraw $2500, use the deposit method
		  to deposit $3000, and print the balance, the monthly interest, and the date when
		  this account was created. */

		Account account = new Account(1122, 20000);
		account.setannualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance: $" + account.getbalance());
		System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
		System.out.println("The date when this account was created: " + 
				account.getdateCreated());
	}
}
		class Account {
		
		// A private int data field named id for the account (default 0)
		private int id = 0;
		
		// A private double data field named balance for the account (default 0)
		private double balance = 0.0;
		
		/* A private double data field named annualInterestRate that stores the current
		  interest rate (default 0). Assume all accounts have the same interest rate */
		private double annualInterestRate = 0.0;
		
		/* A private Date data field named dateCreated that stores the date when the 
		  account was created */
		private java.util.Date dateCreated = new java.util.Date();
		
		// A constructor that creates an account with the specified id and initial balance
		Account(int newId, int newBalance) {
			id = newId;
			balance = newBalance;
		}
		
		// The accessor and mutator methods for id, balance, and annualInterestRate
		public int getid() {
			return id;
		}
		public double getbalance() {
			return balance;
		}
		public void setannualInterestRate(double newAnnualInterestRate) {
			annualInterestRate = newAnnualInterestRate;
		}
		
		// The accessor method for dateCreated
		public java.util.Date getdateCreated() {
			return dateCreated;
		}
		
		/* A method named getMonthlyInterestRate() that returns the monthly interest rate */
		double getMonthlyInterestRate() {
			return annualInterestRate / 12;
		}
		
		double getMonthlyInterest() {
			return balance * getMonthlyInterestRate();
		}
		/* A method named withdraw that withdraws a specified amount from the account */
		double withdraw(double amount) {
			return balance -= amount; 
		}
		
		// A method named deposit that deposits a specified amount to the account
		double deposit(double amount) {
			return balance += amount;
		}
		
		}

