package chapter3;

import java.util.Scanner;

public class NumberTwo {

	public static void main(String[] args) {
		// generate three random integers and prompt the user to enter the sum of these integers
		
		// generate the three random integers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " is " +
		(number1 + number2 + number3 == answer));

	}

}
