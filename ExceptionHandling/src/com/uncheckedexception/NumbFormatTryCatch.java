package com.uncheckedexception;

public class NumbFormatTryCatch {

	public static void main(String[] args) {

		String input = "abc123"; // invalid numeric string

		try {
			int number = Integer.parseInt(input); // this will throw NumberFormatException
			System.out.println("Converted number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Exception caught: " + e.getMessage());
			System.out.println("Please enter a valid numeric string.");
		}

		System.out.println("Program continues after exception handling.");
	}

}
