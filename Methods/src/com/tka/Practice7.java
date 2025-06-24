package com.tka;

public class Practice7 {

//	Write a method that takes an integer N and prints numbers from 1 to N. Call the method using the class name.

	public static String myDisplay(int n) {

		String result = "";
		System.out.println("Numbers from 1 to " + n);

		for (int i = 1; i <= n; i++) {
			result += i +"\n";
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(myDisplay(55));
	}

}
