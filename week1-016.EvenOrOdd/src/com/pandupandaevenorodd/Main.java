package com.pandupandaevenorodd;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = reader.nextInt();

        if(number % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}
