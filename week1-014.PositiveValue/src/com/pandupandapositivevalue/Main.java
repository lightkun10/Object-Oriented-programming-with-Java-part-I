package com.pandupandapositivevalue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int numberInput = Integer.parseInt(reader.nextLine());
        if(numberInput > 0) {
            System.out.println("The number is positive.");
        } else if(numberInput < 0) {
            System.out.println("The number is negative.");
        }
    }
}
