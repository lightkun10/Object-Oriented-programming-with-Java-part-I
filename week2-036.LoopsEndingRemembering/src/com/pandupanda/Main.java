package com.pandupanda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		// 1. Reading the numbers
		//	  The program prints "Type numbers” until the user types the number -1 
		Scanner reader = new Scanner(System.in);
		System.out.println("Type numbers: ");
		int input;
		// 2. The sum of the numbers
		// 	  Print the sum of the numbers entered by the user (without the number -1)
		int sum = 0; // 2
		// 3. Summing and counting the numbers
		//	  Print how many numbers the user typed (without the number -1)
		int counter = 0; // 3
		// 5. Even and odd numbers
		// 	  Print the number of even & odd numbers that the user typed (without the number -1)
		int evenCount = 0; // 5
		int oddCount = 0; // 5
		
		while(true) {
			input = Integer.parseInt(reader.nextLine());
			if(input < 0) { // 1. break when user types the number -1
				break;
			} else if(input >= 0) {
				System.out.println(input);
				sum += input; // 2
				counter++; // 3
				if(input % 2 == 0) { // 5
					evenCount++; 
				} else if(input % 2 != 0) { // 5
					oddCount++;
				}
			}
			
		}
		System.out.println(input);
		System.out.println("Thank you and see you later!"); // 1
		System.out.println("The sum is " + sum); 		// 2
		System.out.println("How many numbers: " + counter); // 3
		// 4. Counting the average
		//	  Print the average of the numbers the user typed (without the number -1)
		System.out.println("Average: " + ((double)sum / counter)); // 4
		System.out.println("Even numbers: " + evenCount); // 5
		System.out.println("Odd numbers: " + oddCount); // 5
    }
}
