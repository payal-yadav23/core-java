package com.uncheckedexception;

public class ArrayInOfBound {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try {
			// Trying to access index 5, which is invalid
			arr[5] = 100; 
		} catch (ArrayIndexOutOfBoundsException e) {
			// Catch block to handle the exception
			System.out.println("Exception caught: " + e);
			System.out.println("Invalid index! Please access indices from 0 to 4.");
		}

		System.out.println("Program continues normally after exception handling.");
	}

}
