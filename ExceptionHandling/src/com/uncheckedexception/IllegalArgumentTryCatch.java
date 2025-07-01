package com.uncheckedexception;

public class IllegalArgumentTryCatch {

	public static void main(String[] args) {

		try {
			int age = -10;

			// Directly throwing IllegalArgumentException inside try block
			if (age < 0) {
				throw new IllegalArgumentException("Age cannot be negative.");
			}

			System.out.println("Age is valid: " + age);

		} catch (IllegalArgumentException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}

		System.out.println("Program continues after exception handling.");
	}
}
