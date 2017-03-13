package chapter18;

import java.util.Scanner;

public class Number_Seventeen {

	public static void main(String[] args) {
		/* Write a recursive method that finds the number of occurrences of a specified
		   character in an array. You need to define the following two methods. The second
		   one is a recursive helper method.
		   		public static int count(char[] chars, char ch)
		   		public static int count(char[] chars, char ch, int high)
		 * Write a test program that prompts the user to enter a list of characters in one
		   line, and a character, and displays the number of occurrences of the character
		   in the list */

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a list of characters in one line: ");
		String str = input.nextLine();
		char[] chars = new char[str.length() - 1];
		for (int i = 0; i < chars.length; i++)
			chars[i] = str.charAt(i);
		char ch = str.charAt(str.length() - 1);
		
		System.out.println("The character " + ch + " occurs " + count(chars, ch) + 
				" time(s) in " + str.substring(0, str.length() - 1));
	}
	
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);
	}
	
	public static int count(char[] chars, char ch, int high) {
		if (high < 0)
			return 0;
		else if (chars[high] == ch)
			return 1 + count(chars, ch, high - 1);
		else
			return count(chars, ch, high - 1);
	}

}
