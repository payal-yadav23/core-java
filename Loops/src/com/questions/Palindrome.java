package com.questions;

public class Palindrome {

	public static void main(String[] args) {

		int num = 121;

		int temp = num, rev = 0;

		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		temp = rev;

		if (rev == temp) {
			System.out.println("This number is Palindrome");
		} else {
			System.out.println("This is not Palindrome");
		}

	}

}
