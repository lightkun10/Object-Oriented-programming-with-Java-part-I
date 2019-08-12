package com.pandupanda;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        int number = reader.nextInt();
        int num = 1;
        while(num <= number) {
            System.out.println(num);
            num++;
        }
    }
}
