package chapter6;

import java.util.Scanner;

public class Number_Three {

	public static void main(String[] args) {
		/* Write the methods with the following headers
		 * Return the reversal of an integer, i.e., reverse(456) returns 654
		 		public static int reverse(int number)
		 * Return true if number is a palindrome
		 		public static boolean isPalindrome(int number)
		 * Use the reverse method to implement isPalindrome. A number is a palindrome if
		   its reversal is the same as itself. Write a test program that prompts the user
		   to enter an integer and reports whether the integer is a palindrome. */
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a three-digit integer: ");
	int number = input.nextInt();
	if (reverse (number) == number) {
		System.out.println(number + " is a palindrome");
	}
	else {
		System.out.println(number + " is not a palindrome");
	}
	}
	
	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static int reverse (int number) {
		int reverseNumber = 0;
		while (number > 0) {
			reverseNumber = (reverseNumber * 10) + (number % 10);
			number = number / 10;
		}
		return reverseNumber;
	}
		
	// Return true if number is a palindrome
	public static boolean isPalindrome(int number) {
		return (number == reverse (number));
	}

	}
