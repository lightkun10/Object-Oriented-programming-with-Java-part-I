package com.pandupandaageofmajority;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Create a program that asks for the user's age and tells whether the user has reached the age of majority (i.e. 18 years old or older).
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        int ageInput = Integer.parseInt(reader.nextLine());
        if(ageInput < 18) {
            System.out.println("You have not reached the age of majority yet!");
        } else if(ageInput >= 18) {
            System.out.println("You have reached the age of majority!");
        }
    }
}
