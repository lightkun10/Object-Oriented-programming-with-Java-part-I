package com.pandupandagradespoints;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int points = reader.nextInt();
        int grade = 0;

        if(points >= 50){
            grade = 5;
        } else if(points >= 45 && points <= 49) {
            grade = 4;
        } else if(points >= 40 && points <= 44) {
            grade = 3;
        } else if(points >= 35 && points <= 39) {
            grade = 2;
        } else if(points >= 30 && points <= 34) {
            grade = 1;
        } else {
            System.out.println("Grade: failed");
        }
        System.out.println("Grade: " + grade);
    }
}
