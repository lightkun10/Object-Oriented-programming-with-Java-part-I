package com.pandupandatemperatures;
import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Graph.addNumber(13.0);

        while (true) {
            System.out.println("Please add a floating number");
            double number = Double.parseDouble(reader.nextLine());

            if(number >= 0 && number <= 39) {
                Graph.addNumber(number);
            }
        }
    }
}
