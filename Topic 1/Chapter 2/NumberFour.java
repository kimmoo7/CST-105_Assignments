package chapter2;

import java.util.Scanner;

public class NumberFour {
	//convert pounds to kilograms
	//1 pound = 0.454 kilograms

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input the number of pounds
		System.out.print("Enter number of pounds(lbs)");
		double pounds = input.nextDouble();
		
		//convert pounds into kilograms
		double kilograms = pounds * 0.454;
				
		System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");

	}

}
