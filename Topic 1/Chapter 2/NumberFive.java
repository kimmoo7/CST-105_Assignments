package chapter2;

import java.util.Scanner;

public class NumberFive {

	public static void main(String[] args) {
		// input subtotal and gratuity rate
		// calculate gratuity and total
		
		Scanner input = new Scanner(System.in);
		
		//input subtotal and gratuity rate
		System.out.print("Enter subtotal and gratuity rate: ");
		double Subtotal = input.nextDouble();
		double GratuityRate = input.nextDouble();

		//convert percentage to decimal and then calculate gratuity
		double Gratuity = ((GratuityRate / 100) * Subtotal);
		//use calculated gratuity to calculate the total
		double Total = Gratuity + Subtotal;
		
		System.out.println("The gratuity is " + Gratuity + " and the total is " + Total);
	}

}
