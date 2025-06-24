package com.parameter;

public class revNatural {

//	Write a method that takes an integer N and prints numbers from 1 to N. Call the method using the class name.


	public static void myDisplay(int n) {
		
		System.out.println("Numbers from 1 to "+ n);
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		myDisplay(55);
	}
}
