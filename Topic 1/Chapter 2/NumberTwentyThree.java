package chapter2;

import java.util.Scanner;

public class NumberTwentyThree {

	public static void main(String[] args) {
		// calculate the cost of trip using distance, miles per gallon, and price per gallon
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter distance in miles: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double costOfTrip = (distance / milesPerGallon * pricePerGallon);
		
		System.out.println("The cost of driving is $" + (int)(costOfTrip * 100) / 100.0);

	}

}

