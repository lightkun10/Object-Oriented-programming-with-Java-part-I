package com.pandupanda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        // Write your program here
        System.out.println("Type the first number: ");
        read = reader.nextInt();
        sum += read;
        System.out.println("Type the second number: ");
        read = reader.nextInt();
        sum += read;
        System.out.println("Type the third number: ");
        read = reader.nextInt();
        sum = sum + read;
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
