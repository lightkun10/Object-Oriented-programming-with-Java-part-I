package com.pandupanda;
import java.util.Scanner;

public class Main3 {
	/* public static void greet(String name, String greetingsFrom) {
		System.out.println("Hi " + name + ", greetings from " + greetingsFrom);
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String who = "Matt";
		String greetings = "Alabama";
		
		greet(who, greetings);
		greet(who, greetings + " from Nevada");
	}
	*/
	
	public static void greet(String name) {
		System.out.println("Hi " + name + ", greetings from the world of methods!");
	}
	
	public static void greetManyTimes(String name, int times) {
		int i = 0;
		while(i < times) {
			greet(name);
			i++;
		}
	}
	
	public static void main(String[] args) {
		greetManyTimes("Jhonny", 3);
		System.out.println("and");
		greetManyTimes("Josephine", 2);
	}
	
}