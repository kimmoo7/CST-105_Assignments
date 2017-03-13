package chapter18;

import java.util.Scanner;

public class Number_Two {

	public static void main(String[] args) {
		/* Rewrite the fib method in Listing 18.2 using iterations
		 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2) and
		   fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci numbers. The
		   current Fibonacci number would then be f0 + f1. The algorithm can be described
		   as follows:
		   		f0 = 0; // For fib(0)
		   		f1 = 1; // For fib(1)
		   		
		   		for (int i = 1; i <= n; i++) {
		   			currentFib = f0 + f1;
		   			f0 = f1;
		   			f1 = currentFib;
		   		}
		   		// After the loop, currentFib is fib(n)
		 * Write a test program that prompts the user to enter an index and displays its
		   Fibonacci number. */
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index: ");
		int index = input.nextInt();
		System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
	}
	
	public static long fib(int index) {
		int f0 = 0;
		int f1 = 1;
		int currentFib;
		
		if (index == 0)
			return 0;
		if (index == 1)
			return 1;
		
		for (int i = 2; i <= index; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}
		
		return f1;
	}

}
