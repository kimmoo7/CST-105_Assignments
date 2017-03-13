package chapter18;

import java.util.Scanner;

public class Number_Nine {

	public static void main(String[] args) {
		/* Write a recursive method that displays a string reversely on the console using
		   the following header:
		   		public static void reverseDisplay(String value)
		 * For example, reverseDisplay("abcd") displays dcba. Write a test program that
		   prompts the user to enter a string and displays its reversal. */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String value = input.next();
		reverseDisplay(value);
		
	}

	public static void reverseDisplay(String value) {
		//Base case
		if (value.length() == 0)
			return;
		else
			System.out.print(value.substring(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
			
	}
}
