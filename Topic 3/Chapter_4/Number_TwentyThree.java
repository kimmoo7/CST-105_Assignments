package chapter4;

import java.util.Scanner;

public class Number_TwentyThree {

	public static void main(String[] args) {
		/* Write a program that reads the following information and prints a payroll 
		   statement:
		 * Employee's name
		 * Number of hours worked in a week
		 * Hourly pay rate
		 * Federal tax withholding rate
		 * State tax withholding rate */

		// Input information
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		int hoursWorked = input.nextInt();
		
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalWithholdingRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateWithholdingRate = input.nextDouble();
		
		//Calculations
		double grossPay = hoursWorked * hourlyPayRate;
		double federalWithholdingAmount = federalWithholdingRate * grossPay;
		double stateWithholdingAmount = stateWithholdingRate * grossPay;
		double totalDeduction = federalWithholdingAmount + stateWithholdingAmount;
		double netPay = grossPay - totalDeduction;
		
		// Output
		System.out.println("\nEmployee Name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: " + hourlyPayRate);
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Deductions:");
		System.out.println("\t Federal Withholding (" + (federalWithholdingRate * 100) +
							"%): $" + federalWithholdingAmount);
		System.out.println("\t State Withholding (" + (stateWithholdingRate * 100) + 
							"%): $" + stateWithholdingAmount);
		System.out.println("\t Total Deduction: $" + totalDeduction);
		System.out.println("Net Pay: $" + netPay);
	}

}
