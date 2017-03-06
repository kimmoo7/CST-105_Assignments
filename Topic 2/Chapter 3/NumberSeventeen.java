package chapter3;

import java.util.Scanner;

public class NumberSeventeen {

	public static void main(String[] args) {
		/* Game of scissor-rock-paper in which the computer randomnly generates a 0, 1,
		or 2 and the user inputs a 0, 1, or 2 and the program displays a message 
		indicating the winner */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userInteger = input.nextInt();
		
		int computerInteger = (int)(Math.random() * 3); 
		
		System.out.print("The computer is");
		switch (computerInteger) {
			case 0: System.out.print(" scissor.");
					break;
			case 1: System.out.print(" rock.");
					break;
			case 2: System.out.print(" paper.");
					break;
		}
		
		System.out.print(" You are");
		switch (userInteger) {
			case 0: System.out.print(" scissor");
					break;
			case 1: System.out.print(" rock");
					break;
			case 2: System.out.print(" paper");
					break;
		}
		
		if (computerInteger == userInteger) {
			System.out.print(" too. It is a draw.");
		}
		
		else {
			boolean win = (computerInteger == 2 && userInteger == 0) || 
						  (computerInteger == 0 && userInteger == 1) ||
						  (computerInteger == 1 && userInteger == 2);
				if (win) 
					System.out.print(". You won.");
				else
					System.out.print(". You lose.");
		}

	}

}
