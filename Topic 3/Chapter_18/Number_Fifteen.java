package chapter18;

import java.util.Scanner;

public class Number_Fifteen {

	public static void main(String[] args) {
		/* Rewrite Programming Exercise 18.10 using a helper method to pass the substring
		   high index to the method. The helper method is:
		   		public static int count(String str, char a, int high) */

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.print("Enter a character: ");
		char ch = input.nextLine().charAt(0);
		
		int times = count(s, ch);
		System.out.println(s + " contains the character " + ch + " " + times + 
				(times > 1 ? " times " : " time "));
	}

	public static int count(String str, char a) {
		int result = 0;
		if (str.length() > 0)
			result = count(str.substring(1), a) + ((str.charAt(0) == a) ? 1 : 0);
		
		return result;
		
	}
	
	public static int count(String str, char a, int high) {
		int n = (a == str.charAt(0)) ? 1 : 0;
		if (high <= 0)
			return n;
		return n + count(str.substring(1), a, high - 1);
	}
}

