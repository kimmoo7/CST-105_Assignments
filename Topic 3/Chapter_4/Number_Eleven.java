package chapter4;

import java.util.Scanner;

public class Number_Eleven {

	public static void main(String[] args) {
		/* Write a program that prompts the user to enter an integer between 0 and 15 and
		  displays its corresponding hex number. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimalValue = input.nextInt();
		char hexValue = (char)('A' + decimalValue - 10);
		
		if (decimalValue > 15 || decimalValue < 0) {
			System.out.println(decimalValue + " is an invalid input");
		}
		else if (decimalValue < 10) {
			System.out.println("The hex value is " + decimalValue);
		}
		else {
			System.out.println("The hex value is " + hexValue);
		}
	}

}
