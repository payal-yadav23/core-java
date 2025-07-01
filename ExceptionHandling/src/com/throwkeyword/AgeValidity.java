package com.throwkeyword;

public class AgeValidity {

	public static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("You must be 18 or older to vote");
		} else {
			System.out.println("Allowed to vote!");
		}
	}

	public static void main(String[] args) {

		try {
			checkAge(15);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
