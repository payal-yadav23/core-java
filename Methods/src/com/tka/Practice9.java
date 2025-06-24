package com.tka;

public class Practice9 {

//	Write a method that takes an integer N and prints natural numbers from N to 1. Call the method using the class name.

	public static String Natural(int n) {

		String result = "";
		System.out.println("Natural Numbers from 1 to " + n);
		for (int i = n; i >= 1; i--) {
			result += i + "\n";
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(Practice9.Natural(30));
	}
}
