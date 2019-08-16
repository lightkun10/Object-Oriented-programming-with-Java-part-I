package com.pandupanda;

public class PrintingLikeBoss {
	public static void printStars(int size) {
		for(int i = 1; i <= size; i++) {
			System.out.print("*");
			}
		System.out.println(); // create new line
	}
	
	public static void printWhiteSpace(int size) { // 4		
		int i = 1;
		while(i <= size) {
			System.out.print(" ");
			i++;
		}
	}
	
	public static void printTriangle(int size) { // 4
		// int amount = size-1;	
		int i = 1;
		while(i <= size) {
			printWhiteSpace(size-i);
			printStars(i);
			i++;
			//size--;
		}
	}
	
	public static void xmasTree(int height) {
		int whiteSpace = height;
		int i = 1;
		int stars = i;
		while(i <= height) {
			printWhiteSpace(whiteSpace-1);
			printStars(stars);
			i++;
			stars+=2;
			whiteSpace--;
		}
		printWhiteSpace(height-2);
		printStars(3);
		printWhiteSpace(height-2);
		printStars(3);
	}

    public static void main(String[] args) {
		//printTriangle(4);
		//System.out.println("\n---");
		//xmasTree(10);
		
		printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        // System.out.println("---");
        // xmasTree(40);
    }
}
