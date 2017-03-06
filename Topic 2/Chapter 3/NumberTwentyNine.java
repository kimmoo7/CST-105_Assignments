package chapter3;

import java.util.Scanner;

public class NumberTwentyNine {

	public static void main(String[] args) {
		/* Prompts the user to enter the center coordinates and radii of two circles and
		   determines whether the second circle is insdie the first or overlaps with the 
		   first */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double distanceBetweenCenters = Math.pow(Math.pow(x2 - x1, 2) + 
				Math.pow(y2 - y1, 2), 0.5);
		
		if (distanceBetweenCenters <= r1 - r2) {
			System.out.println("circle2 is inside circle1");
		}
		else if (distanceBetweenCenters <= r1 + r2) {
			System.out.println("circle2 overlaps circle1");
		}
		else {
			System.out.println("circle2 does not overlap circle1");
		}

	}

}
