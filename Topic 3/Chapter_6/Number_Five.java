package chapter6;

import java.util.Scanner;

public class Number_Five {

	public static void main(String[] args) {
		/* Write a method with the following header to display three numbers in increasing
		   order:
		 * public static void displaySortedNumbers(double num1, double num2, double num3)
		 * Write a test program that prompts the user to enter three numbers and invokes 
		   the method to display them in increasing order. */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
	
		displaySortedNumbers(num1, num2, num3);
	}

	public static void displaySortedNumbers (double num1, double num2, double num3) {
		double temp;
		
		if (num2 < num1 && num2 > num3) {
			temp = num1;
			num1 = num2;
			num2 = num3;
		}
		else if (num3 < num1 && num3 > num2) {
			temp = num1;
			num1 = num3;
			num3 = num2;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println("The numbers in increasing order are: \n" + num1 + ", " +
		num2 + ", " + num3);
	}
}
