package com.pandupanda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SimpleAndEasyToRead {
  // MAIN PROGRAM
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(4);
    numbers.add(3);
    numbers.add(7);
    numbers.add(3);

    System.out.println("The numbers in the beginning:");

    // here we print numbers
    print(numbers); // 4,3,7,3

    // list name, item to be removed
    remove(numbers, 3);

    System.out.println("The numbers after removal:");

    // here we print numbers
    print(numbers);

  }

  // METHOD
  public static void print(ArrayList<Integer> items) {
    for (int item : items) { // each item in "items" array
      System.out.println(item);
    }
  }

  public static void remove(ArrayList<Integer> numbers, int numToRemove) {
    while (numbers.contains(Integer.valueOf(numToRemove))) {
      numbers.remove(Integer.valueOf(numToRemove));
    }
  }

}

// The characters in a string are numbered (indexed) starting from 0. This means
// that we can reach the last character in a string with number (or index) "the
// length of the word minus one", or word.charAt(word.length()-1)