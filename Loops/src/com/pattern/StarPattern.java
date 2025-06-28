package com.pattern;

public class StarPattern {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; ++j) {

				System.out.println("* ");

			}

			System.out.println();
		}

//		for (int i = 1; i <= 5; ++i) { // Outer loop for rows
//
//			for (int j = 1; j <= i; ++j) { // Inner loop for Col
//
//				System.out.print("* "); // Print *
//
//			}
//
//			System.out.println(); // New line
//
//		}
	}

}
