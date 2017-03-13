package chapter6;

import java.util.Scanner;

public class Number_Eighteen {

	public static void main(String[] args) {
		/* Some websites impose certain rules for passwords. Write a method that checks 
		   whether a string is a valid password. Suppose the password rules are as follows
		   		A password must have at least eight characters
		   		A password consists of only letters and digits
		   		A password must contain at least two digits
		 * Write a program that prompts the user to enter a password and displays Valid
		   Password if the rules are followed or Invalid Password otherwise. */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter password: ");
		String s = input.nextLine();
		
		if (isValidPassword(s)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}

	public static boolean isValidPassword(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)))
				return false;
		}
		
		if (s.length() < 8) 
			return false;
	
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i)))
				count++;
		}
		if (count >= 2) {
			return true;
		}
		else 
			return false;
	}
}
