package com.parameter;

public class MultTable {

//	Write a method that takes an integer and prints its multiplication table up to 10. Call the method using the class name.

	public static void myTable(int n) {

		System.out.println("Table of " + n);

		for (int i = 1; i <= 10; i++) {

			System.out.println(n + " x " + i + " = " + i * n);
		}
	}

	public static void main(String[] args) {

		myTable(15);
	}

}
