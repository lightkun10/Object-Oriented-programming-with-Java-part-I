package com.pandupandagreaternumber;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int input1 = reader.nextInt();
        System.out.println("Type the second number: ");
        int input2 = reader.nextInt();

        if(input1 > input2) {
            System.out.println("Greater number: " + input1);
        } else if(input1 < input2) {
            System.out.println("Greater number: " + input2);
        } else if(input1 == input2) {
            System.out.println("The numbers are equal!");
        }
    }
}
