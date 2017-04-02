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
		String [] words = {"program", "word", "hello", "hangman", "computer"};
		
		do {
			int i = intRandom(0, words.length - 1);
			char[] word = words[i].toCharArray();
			boolean[] mask = new boolean[word.length];
			int correctGuesses = 0;
			int misses = 0;
		while (correctGuesses != word.length){
			System.out.print("(Guess) Enter a letter in word ");
	
			
			for (int j = 0; j < word.length; j++) {
				if (mask[j])
					System.out.print(word[j]);
				else 
					System.out.print("*");
			}
		
		System.out.print(">");
		char guess = input.next().charAt(0);
		
		boolean miss = true;
		boolean repeat = false;
		
		for (int j = 0; j < word.length; j++) {
			if (word[j] == guess) {
				if (mask[j] != true) {
					mask[j] = true;
					correctGuesses++;
				}
				else {
					repeat = true;
					break;
				}
				miss = false;
			}
		}
		
		if (miss)
			misses++;
		if (repeat)
			System.out.println(guess + " is already in the word");
		}

		System.out.println("The word is " + String.valueOf(word) + ". You missed " +
				misses + " times");
			
		System.out.println("Do you want to guess another word? Enter y or n> ");
			answer = input.next();
		
		} while (answer.charAt(0) != 'n');
		
	}
	
	public static int intRandom(int lowerBound, int upperBound) {
		return (int) (lowerBound + Math.random() * (upperBound - lowerBound + 1));
		
	}
}
