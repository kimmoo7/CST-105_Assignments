package timeConversion;

import java.util.Scanner;

public class Part_One {

	public static void main(String[] args) {
		/* Write a program that will prompt the user to enter an hour in the 24-hour 
		   format and print it in the 12-hour format. Example: 18 prints 6pm
		 * Convert data through the use of a formatter class and the use of upcasting 
		   and downcasting.
		 * Read information entered by user, format it, and print in the console. */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an hour in the 24-hour format: ");
		twentyFourHour = input.nextInt();
		
		System.out.println(doConversion(twentyFourHour));
		
	}
	
	private static String doConversion(int twentyFourHour) {
		return twentyFourHour % 12 + ((twentyFourHour > 12) ? "pm" : "am");
	}
	
	public static int doConversion(int twentyFourHour) {
		
	}
