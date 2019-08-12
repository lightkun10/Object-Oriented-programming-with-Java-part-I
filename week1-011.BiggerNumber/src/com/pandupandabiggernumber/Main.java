package com.pandupandabiggernumber;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = reader.nextInt();
        System.out.println("Type another number: ");
        int b = reader.nextInt();

        System.out.println("The bigger number of the two numbers given was: " + Math.max(a, b));
    }
}
