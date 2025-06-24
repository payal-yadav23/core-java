package com.tka;

public class Practice4 {
	  
//	 Write a method that takes an integer as a parameter and prints whether it is even or odd. Call the method using the class name.
		
		public static String myNum(int num) {

			if (num % 2 == 0) {
				return num + " is an Even Number ";
			} 
			else {
				return num + " is an Odd Number";
			}
		
		}

		public static void main(String[] args) {

			System.out.println(myNum(11512));
		}
		
			

}
