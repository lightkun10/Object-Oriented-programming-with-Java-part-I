package com.pandupanda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int first = reader.nextInt();
        System.out.println("Last: ");
        int last = reader.nextInt();

        while(first <= last) {
            System.out.println(first);
            first++;
        }
    }
}
