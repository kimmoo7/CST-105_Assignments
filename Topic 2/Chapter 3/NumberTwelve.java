package chapter3;

import java.util.Scanner;

public class NumberTwelve {

	public static void main(String[] args) {
		/* prompts the user to enter a three-digit integer and determine whether or not
		   it is a palindrome number */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int integer = input.nextInt();
		
		// get digits from integer
		int integerDigit1 = integer / 100;
		int integerDigit2 = integer / 10;
		int integerDigit3 = integer % 10;
		
		if (integerDigit1 == integerDigit3) {
			System.out.println(integer + " is a palindrome.");
		}
		else {
			System.out.println(integer + " is not a palindrome.");
		}
	}

}
