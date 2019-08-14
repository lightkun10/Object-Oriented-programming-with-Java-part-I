package com.pandupanda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 1;
        int factorial = 1;
        System.out.println("Type a number: ");
        int number = reader.nextInt();

        while(count < number) {
            count++;
            factorial *= count;
        }
        System.out.println(factorial);
    }
}

// 3
// 1 < 3
// count + 1 = 2
// factorial * count = 1 * 2 = 2

// 2 < 3
// count + 1 = 3
// factorial * count = 2 * 3 = 6

// 3 = 3, not < or >
// BREAK
