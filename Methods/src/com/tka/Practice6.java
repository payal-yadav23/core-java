package com.tka;

public class Practice6 {

	// Write a method that takes two numbers as parameters and swaps them without
	// returning anything. Call the method using the class name.

	public static String swap(int a, int b) {

		System.out.println("Number before swap : a = " + a + " b = " + b);
		int c = a; // c = 10
		a = b; // a=20
		b = c; // b=10

		return "Swaped numbers are : a = " + a + " b = " + b;
	}

	public static void main(String[] args) {
		System.out.println(swap(10, 20));
	}

}
