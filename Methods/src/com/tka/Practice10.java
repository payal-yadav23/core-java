package com.tka;

public class Practice10 {

//	Write a method that takes an integer n and prints its square of number upto n. Call the method using the class name.

	public static String mySquares(int n) {

		String result = "";
		for (int i = 1; i <= n; i++) {
			result += i + " Square is : " + i * i + "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(mySquares(5));
	}
}
