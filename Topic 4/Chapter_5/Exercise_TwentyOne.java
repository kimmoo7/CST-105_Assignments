package chapter5;

import java.util.Scanner;

public class Exercise_TwentyOne {

	public static void main(String[] args) {
		/* Write a program that lets the user enter the loan amount and loan period in 
		   number of years and displays the monthly and total payments for each interest
		   rate starting from 5% to 8%, with an increment of 1/8 
		   		monthlyPayment = (loanAmount x monthlyInterestRate) / 
		   		 (1 - (1 / (1 + monthlyInterestRate)^(numberOfYears x 12))))
		   	    totalPayment = monthlyPayment x numberOfYears x 12 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Loan amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		
		System.out.println("Interest Rate \t Monthly Payment \t Total Payment");

		for (double i = 5.0; i <= 8.0; i+=0.125) {
			double monthlyInterest = (i / 100) / 12;
			double monthlyPayment = (loanAmount * monthlyInterest) / (1 
					- 1 / Math.pow(1 + monthlyInterest, years * 12));
			double totalPayment = monthlyPayment * years * 12;
			
			System.out.printf("%.3f" + "\t\t    " + "%.2f" + "\t\t    " + 
			"%.2f" + "\n", i, monthlyPayment, totalPayment);
		}
	
	}

}
