package com.pandupanda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        int lastNum;
        int sum = 0;

        System.out.println("First: ");
        number = reader.nextInt();
        System.out.println("Last: ");
        lastNum = reader.nextInt();

        while(number <= lastNum) {
            sum += number;
            number++;
        }
        System.out.println("The sum is " + sum);

    }
}
