package chapter3;

import java.util.Scanner;

public class NumberFive {

	public static void main(String[] args) {
		/* have the user enter an integer for today's day of the week and prompt the user
		   to enter the number of days after today for a future day and display the future
		   day of the week */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day as an integer (0 for Sunday, 1 for Monday, etc.): ");
		int dayAsInteger = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		int futureday = (dayAsInteger + daysElapsed) % 7;
		
		switch (dayAsInteger) {
			case 0: System.out.print("Today is Sunday and ");
					break;
			case 1: System.out.print("Today is Monday and ");
					break;
			case 2: System.out.print("Today is Tuesday and ");
					break;
			case 3: System.out.print("Today is Wednesday and ");
					break;
			case 4: System.out.print("Today is Thursday and ");
					break;
			case 5: System.out.print("Today is Friday and ");
					break;
			case 6: System.out.print("Today is Saturday and ");
					break;
		}
		
		switch (futureday) {
			case 0: System.out.print("the future day is Sunday.");
					break;
			case 1: System.out.print("the future day is Monday.");
					break;
			case 2: System.out.print("the future day is Tuesday.");
					break;
			case 3: System.out.print("the future day is Wednesday.");
					break;
			case 4: System.out.print("the future day is Thursday.");
					break;
			case 5: System.out.print("the future day is Friday.");
					break;
			case 6: System.out.print("the future day is Saturday.");
					break;
		}
	}

}
