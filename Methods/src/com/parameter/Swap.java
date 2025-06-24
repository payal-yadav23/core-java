package com.parameter;

public class Swap {

//	Write a method that takes two numbers as parameters and swaps them without returning anything. Call the method using the class name.

	public static void mySwap(int a, int b) {

		System.out.println("Number before swap : a = " + a + " b = " + b);

		int c = a; // c = 10
		a = b; // a=20
		b = c; // b=10

		System.out.println("Swaped numbers are : a = " + a + " b = " + b);
	}

	public static void main(String[] args) {
		mySwap(10, 20);
	}
}
