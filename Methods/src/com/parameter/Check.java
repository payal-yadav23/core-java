package com.parameter;

public class Check {

//	  Write a method that takes an integer as a parameter and prints whether it is even or odd. Call the method using the class name.

	public static void myNum(int num) {

		if (num % 2 == 0) {
			System.out.println(num + " is an Even Number ");
		} else {
			System.out.println(num + " is an Odd Number");
		}
	}

	public static void main(String[] args) {

		myNum(11511);
	}
}
