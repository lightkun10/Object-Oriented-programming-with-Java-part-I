package com.pandupanda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int countdown = 1;
            int num = 1;
            int count = 1; // know how many times it counting
            System.out.println("Until what?");
            int untilNum = reader.nextInt();

            while(countdown < untilNum) {
                countdown++;
                count++;
                num += count;
            }

            System.out.println("sum is " + num);
    }
}
