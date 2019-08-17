package com.pandupanda;
import java.util.Scanner;
import java.util.Random;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
		int numberOfGuess = 0;
		while(true) {
			int guess;
			System.out.println("Guess a number:");
			guess = Integer.parseInt(reader.nextLine());

			if(guess == numberDrawn) {
				System.out.println("Congratulations, your guess is correct!");
				break;
			} else if(guess < numberDrawn) {
				numberOfGuess += 1;
				System.out.println("The number is greater, guesses made: " + numberOfGuess);
			} else if(guess > numberDrawn) {
				numberOfGuess+=1;
				System.out.println("The number is lesser, guesses made: " + numberOfGuess);
			}
			
		}
		

    }

	// DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
