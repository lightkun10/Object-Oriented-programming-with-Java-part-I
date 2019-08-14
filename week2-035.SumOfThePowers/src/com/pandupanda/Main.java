package com.pandupanda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int powers = 0;
        double number;

        System.out.println("Type a number: ");
        number = reader.nextDouble();

        while(powers <= number) {
            sum += (int)Math.pow(2, powers);
            powers++;
        }
        System.out.println(sum);

    }
}
