package chapter7;

import java.util.Random;
import java.util.Scanner;

public class Exercise_ThirtyFive {

	public static void main(String[] args) {
		/* Write a hangman game that randomly generates a word and prompts the user to
		   guess one letter at a time. Each letter in the word is displayed as an
		   asterisk. When the user makes a correct guess, the actual letter is then 
		   displayed. When the user finishes a word, display the number of misses and ask
		   the user whether to continue to play with another word. Declare an array to 
		   store words, follows:
		   		// Add any words you wish in this array
		   		String[] words = {"write", "that", ...}; */
		
		Scanner input = new Scanner(System.in);
		
		String answer;
		
		// Add any words you wish in this array
		String [] words = {"program", "word", "hello", "dead", "hangman", "computer"};
		
		private Random randomGenerator;
		randomGenerator = new Random();
		
		do {
			String word = words[randomGenerator.nextInt(words.length)];
			String guess = "";
			
			for (int i = 0; i < word.length(); i++ ) {
				guess += "*";
			}
			
			while (wordNotDone) {
				
			}

			System.out.println("Do you want to guess another word? Enter y or n> ");
			answer = input.nextLine();
		
		} while (answer.equals("y"));
		
	}
}
