package com.tka;

public class Practice8 {

// Write a method that takes an integer as a parameter and prints whether it is positive, negative, or zero. Call the method using the class name.

	public static String myCheck(int n) {
		
		if(n<0)
		{
			return n+ " is Negative..!!";
		}
		else if(n>0)
		{
			return n+ " is Positive..!!";
		}
		else {
			return "It's a Zero..!!";
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(Practice8.myCheck(-8));
	}
}
