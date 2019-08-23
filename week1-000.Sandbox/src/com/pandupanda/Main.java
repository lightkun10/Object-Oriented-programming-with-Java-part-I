package com.pandupanda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	// MAIN PROGRAM

	public static void print(ArrayList<String> x) {
		for (String word : x) {
			System.out.println(word);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> programmingLanguages = new ArrayList<String>();
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("C++");

		ArrayList<String> countries = new ArrayList<String>();
		countries.add("Finland");
		countries.add("Indonesia");
		countries.add("German");

		print(programmingLanguages);
		System.out.println();
		print(countries);
	}

	// METHOD

}

// The characters in a string are numbered (indexed) starting from 0. This means
// that we can reach the last character in a string with number (or index) "the
// length of the word minus one", or word.charAt(word.length()-1)