package chapter3;

import java.util.Scanner;

public class NumberEighteen {

	public static void main(String[] args) {
		/* prompt the user to enter the weight of the package and then display the 
		shipping cost. If the package is greater than 50 then it can't be shipped*/
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input weight of package
		System.out.print("Enter the weight of the package in pounds: ");
		
		int weight = input.nextInt();
		
		if (0 < weight && weight <= 1) {
			System.out.println("The cost of shipping is $3.50");
		}
		else if (1 < weight && weight <= 3) {
			System.out.println("The cost of shipping is $5.50");
		}
		else if (3 < weight && weight <= 10) {
			System.out.println("The cost of shipping is $8.50");
		}
		else if (10 < weight && weight <= 20) {
			System.out.println("The cost of shipping is $10.50");
		}
		else if (20 < weight && weight <= 30) {
			System.out.println("The cost of shipping is $12.50");
		}
		else if (30 < weight && weight <= 40) {
			System.out.println("The cost of shipping is $14.50");
		}
		else if (40 < weight && weight <= 50) {
			System.out.println("The cost of shipping is $16.50");
		}
		else {
			System.out.println("The package cannot be shipped");
		}
		

	}

}
