package chapter6;

import java.util.Scanner;

public class Number_Seven {

	public static void main(String[] args) {
		/* Write a method that computes future investment value at a given interest rate 
		   for a specified number of years. The future investment is determined using the
		   formula in Programming Exercise 2.21.
		 *		futureInvestmentValue = investmentAmount * 
		 			(1 + monthlyInterestRate)^numOfYears * 12
		 * Use the following method header:
		    public static double futureInvestementValue(
		      double investementAmount, double monthlyInterestRate, int years)
		 * For example, futureInvestementValue(10000, 0.05/12, 5) returns 12833.59
		 * Write a test program that prompts the user to enter the investment amount and
		   the interest rate and prints a table that displays future value for the years
		   from 1 to 30 */

		double[] investmentAmount = new double[30];
		double[] annualInterestRate = new double[30];
		
		Scanner input = new Scanner(System.in);
		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 12;
		
		System.out.println("Years \t\t Future Value");
		for (int i = 1; i <= 30; i++) {
			System.out.println(i + "\t\t " + 
				futureInvestmentValue(investmentAmount[i]), monthlyInterestRate[i], i);
		}
			
	}
	
	public static double futureInvestmentValue(
			double investmentAmount, double monthlyInterestRate, int years) {
		
		double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
		return futureValue;

	}

}
