package chapter9;

import java.util.Scanner;

public class Number_Ten {

	public static void main(String[] args) {
		/* Design a class named QuadraticEquation for a a quadratic equation ax^2 + bx + c
		 = 0. Write a test program that prompts the user to enter values for a, b, and c 
		 and displays the result based on the discriminant. If the discriminant is 
		 positive, display the two roots. If the discriminant is 0, display the one root. 
		 Otherwise, display "The equation has no roots." */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation equation = new QuadraticEquation (a, b, c);
		double discriminant = equation.getDiscriminant();
		
		if (discriminant < 0) {
			System.out.println("The equation has no roots.");
		}
		else if (discriminant == 0) {
			System.out.println("The root is " + equation.getRoot1());
		}
		else {
			System.out.println("The roots are " + equation.getRoot1() + " and " + 
				equation.getRoot2());
		}
	}
}

		class QuadraticEquation {
			private double a;
			private double b;
			private double c;
			
			public QuadraticEquation (double newA, double newB, double newC) {
				a = newA;
				b = newB;
				c = newC;
			}
			
			double getA () {
				return a;
			}
			
			double getB() {
				return b;
			}
			
			double getC() {
				return c;
			}
			
			double getDiscriminant () {
				return b * b - 4 * a * c;
			}
			
			double getRoot1() {
				if (getDiscriminant() < 0)
					return 0;
				else {
					return (-b + (getDiscriminant()) / (2 * a));
				}
			}
			
			double getRoot2() {
				if (getDiscriminant() < 0) 
					return 0;
				else {
					return (-b - getDiscriminant() / (2 * a));
				}
			}
		}
