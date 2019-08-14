package com.pandupanda;
import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Are you sure about this current path that you'll take?");
		System.out.println("Yes or No.");
		String choice = reader.nextLine();
		
		if(choice == "Yes" || choice == "yes") {
				System.out.println("Okay. That is your choice...");
				System.out.println("Your answer is " + choice);
		} else if(choice == "No" || choice == "no") {
			System.out.println("Okay. That is your choice...");
			System.out.println("Your answer is " + choice);
		} else {
			System.out.println("Well, you can comeback to this later.");
			System.out.println("You're still unsure, huh. ");
		}
		
		System.out.println("\nWhatever your choice, I respect that.");
		
	}
	
}