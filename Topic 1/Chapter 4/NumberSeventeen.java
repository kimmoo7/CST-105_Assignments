package chapter4;

import java.util.Scanner;

public class NumberSeventeen {

	public static void main(String[] args) {
		// Determine the number of days in a given month of a given year
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter first three letters of a month: ");
		String month = input.nextLine();
		
		boolean leapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
		
		switch (month){
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println(month + year + " has 31 days"); break;
			
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			System.out.println(month + year + " has 30 days"); break;
			
		case "Feb":
			if(leapYear){
				System.out.println(month + year + " has 29 days");
			}
			else {
				System.out.println(month + " " + year + " has 28 days");
			}
			
		}
		
	
	}

}
