package chapter7;

import java.util.Scanner;

public class Exercise_Nine {

	public static void main(String[] args) {
		/* Write a method that finds the smallest element in an array of double values 
		   using the following header:
		   	public static double min(double[] array)
		 * Write a test program that prompts the user to enter ten numbers, invokes this
		   method to return the minimum value, and displays the minimum value. */

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ten numbers: ");
		double[] list = new double[10];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextDouble();
		}
		
		System.out.println("The minimum number is " + min(list));
	}

	public static double min(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) 
				min = array[i];
		}
		
		return min;
	}
}
