package com.questions;

public class Prime_Composite {

	// Check whether a number is Prime or Composite using for and if-else

	public static void main(String[] args) {

		int num = 6;
		int factors = 0;
		for (int i = 2; i <= num; i++) {

			if (num % i == 0) {
				factors++;
			}
		}
		if (factors == 1) {
			System.out.println("number is Prime");
		} else {
			System.out.println("number is composite");
		}

	}
}
