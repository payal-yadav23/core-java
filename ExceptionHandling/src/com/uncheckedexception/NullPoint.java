package com.uncheckedexception;

public class NullPoint {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("String is null so cannot find length");
		} finally {
			System.out.println("Exception Handling.....");
		}

	}

}
