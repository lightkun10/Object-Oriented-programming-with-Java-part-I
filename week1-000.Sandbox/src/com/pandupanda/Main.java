package com.pandupanda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	// MAIN PROGRAM
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(3);
		numbers.add(7);
		numbers.add(3);

		System.out.println(numbers); // prints [4,3,7,3]

		removeFirst(numbers);

		System.out.println(numbers); // prints [3,7,3]
	}

	// METHOD
	public static void removeFirst(ArrayList<Integer> list) {
		list.remove(0); // removes the number from index 0
	}

}

// The characters in a string are numbered (indexed) starting from 0. This means
// that we can reach the last character in a string with number (or index) "the
// length of the word minus one", or word.charAt(word.length()-1)