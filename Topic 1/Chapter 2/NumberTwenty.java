package chapter2;

import java.util.Scanner;

public class NumberTwenty {

	public static void main(String[] args) {
		// calculate interest using balance and interest rate
		
		Scanner input = new Scanner(System.in);
		
		//inpute balance and interest rate
		System.out.print("Enter balance and interest rate (e.g. 4.5 for 4.5%): ");
		double balance = input.nextDouble();
		double InterestRate = input.nextDouble();
		
		//calculate amount of interest
		double Interest = (balance * (InterestRate / 1200));
		
		System.out.println("The amount of interest is " + Interest);

	}

}
