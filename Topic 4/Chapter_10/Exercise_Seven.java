package chapter10;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Exercise_Seven {

	public static void main(String[] args) {
		/* Use the Account class created in Programming Exercise 9.7 to simulate an ATM
		   machine. Create ten accounts in an array with id 0, 1,...., 9, and initial
		   balance $100. The system prompts the user to enter an id. If the id is entered
		   incorrectly, ask the user to enter a correct id. Once an id is accepted, the 
		   main menu is displayed as shown in the sample run. You can enter a choice 1 for
		   viewing the current balance, 2 for withdrawing money, 3 for depositing money, 
		   and 4 for exiting the main menu. Once you exit, the system will prompt for an 
		   id again. Thus, once the system starts, it will not stop.
		 */

		Scanner	input = new Scanner(System.in);
		Account[] accounts = new Account[10];
		
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
		
		int option = 0;
		int id = askForID(accounts);
		while (option != 4) {
			Account user = getAccount(accounts, id);
				System.out.print("Main Menu \n" +
								"1: Check balance\n" + 
								"2: Withdraw\n" +
								"3: Deposit\n" +
								"4: Exit\n" +
								"Enter a choice: ");
				option = input.nextInt();
				switch(option) {
					case 1: 
						System.out.println("The balance is $" + user.getBalance);
						break;
					case 2:
						System.out.println("Enter an amount to withdraw: ");
						user.withdraw(input.nextDouble());
						break;
					case 3:
						System.out.println("Enter an amount to deposit: ");
						user.deposit(input.nextDouble());
						break;
					case 4:
						System.out.println("Logging out...");
						System.out.println("");
						id = askForID(accounts);
						option = 0;
						break;
						default:
							System.out.println("Invalid input... Enter a number between 1-4");
				}
		}
	}

	public static int askForID(Account[] accounts) {
		Scanner input = new Scanner(System.in);
		
		int id = 0;
		boolean isValidID = false;
		
		while(!isValidID) {
			System.out.print("Enter an ID: ");
			id = input.nextInt();
			
			if (!hasID(accounts, id)) {
				System.out.println("INVALID ID: Try again");
			}
			
			else {
				isValidID = true;
			}
		}
		
		return id;
	}
	
	public static Account getAccount(Account[] accounts, int id) {
		for (Account account : accounts) {
			if (id == account.getID()) {
				return account;
			}
		}
		
		return null;
	}
	
	public static boolean hasID(Account[] accounts, int id) {
		for (Account account : accounts) {
			if (id == account.getID()) {
				return true;
			}
		}
		
		return false;
	}
}

class Account {
	protected String mName;
	protected int mId;
	protected double mBalance;
	protected double mAnnualInterestRate;
	protected Date mDateCreated;
	protected ArrayList<Transaction> mTransactions;
	
	public Account() {
		mDateCreated = new Date();
		mTransactions = new ArrayList<>();
	}
		
	public Account(int id, double balance) {
		this();
		mId = id;
		mBalance = balance;
	}
	
	public Account(String name, int id, double balance) {
		this(id, balance);
		mName = name;
	}
	
	public int getID(){
		return mId;
	}
	
	public double getBalance() {
		return mBalance;
	}
	
	public void setBalance(double balance) {
		mBalance = balance;
	}
	
	public double getAnnualInterestRate() {
		return mAnnualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		mAnnualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return mDateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return mBalance * (mAnnualInterestRate / 12) / 100;
	}
	
	public void withdraw(double amount) {
		mTransactions.add(new Transaction('D', amount, mBalance, "deposit"));
		mBalance += amount;
	}
	
	@Override
	public String toString() {
		return "Account name: " + mName + "\n" + "Interest rate: " + 
				mAnnualInterestRate + "\n" + mTransactions;
	}
	
	public ArrayList<Transaction> getTransactions() {
		return new ArrayList<>(mTransactions);
	}
}