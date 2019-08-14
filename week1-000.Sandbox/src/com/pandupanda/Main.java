package com.pandupanda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// 		  Scanner reader = new Scanner(System.in);
//        System.out.println("Type your age: ");
//
//		int age = Integer.parseInt(reader.nextLine());
//
//		while(age < 5 || age > 85) { // age less than 5 OR greater than 85
//			System.out.println("You are lying!");
//			if(age < 5) {
//				System.out.println("You are so young that you cannot know how to write!");
//			} else if(age > 85) {
//				System.out.println("You are so old that you cannot know how to use a computer!");
//			}
//
//			System.out.println("Type your age again: ");
//			age = Integer.parseInt(reader.nextLine());
//		}
//
//		System.out.println("Your age is " + age);

////////////////////////////////////////////////////////////////////////////////////////
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Type your age: ");
		int age; // initialize age first
		
		while(true) {
			age = Integer.parseInt(reader.nextLine());
			
			if(age >= 5 && age <= 85) { // age between 5 and 85
				break; // end the loop
			}
			
			System.out.println("You are lying!");
			if(age < 5) {
				System.out.println("You are so young that you cannot know how to write!");
			} else { // that means age is over 85
				System.out.println("You are so old that you cannot know how to use a computer!");
			}
			
			System.out.println("Type your age again: ");
		}
		
		System.out.println("Your age is: " + age);
    }
}
