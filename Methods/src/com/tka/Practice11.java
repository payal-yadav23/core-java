package com.tka;

public class Practice11 {

//	Write a method that takes an integer and prints its reverse. Call the method using the class name.

	public static int myReverse(int num) {
		int rev = 0;
		
		System.out.println("Number : "+num);
		while(num!=0) {
			int rem = num%10;
			rev = rev * 10 +  rem;
			num = num / 10 ;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println("Reversed number: "+myReverse(75));
	}
	
}
