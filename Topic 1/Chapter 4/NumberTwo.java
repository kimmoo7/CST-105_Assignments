package chapter4;

import java.util.Scanner;

public class NumberTwo {

	public static void main(String[] args) {
		// input the latitude and longitude of two points on earth to calculate distance
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point 1 (latitude and longitude formatted with space, e.g. x1 y1) in degrees: ");
		double x1 = input.nextDouble();
		x1 = Math.toRadians(x1);
		double y1 = input.nextDouble();
		y1 = Math.toRadians(y1);
		
		System.out.print("Enter point 2 (latitude and longitude formatted with space, e.g. x2 y2) in degrees: "); 
		double x2 = input.nextDouble();
		x2 = Math.toRadians(x2);
		double y2 = input.nextDouble();
		y2 = Math.toRadians(y2);
		
		double distance = 6371 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("The distance between the two points is " + distance + "km");

	}

}
