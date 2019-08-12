package com.pandupandausernames;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username1 = "alex", username2 = "emily";
        String password1 = "mightyducks", password2 = "cat";

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String username = reader.nextLine();
        System.out.println("Type your password: ");
        String password = reader.nextLine();

        if(username.equals(username1) && password.equals(password1)) {
            System.out.println("You are now logged into the system!");
        } else if(username.equals(username2) && password.equals(password2)) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
