package com.pandupanda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String input = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(input));
    }

    public static char lastCharacter(String text) {
        return text.charAt(text.length() - 1);
    }
}
