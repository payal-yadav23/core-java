package com.tka;

public class Practice5 {

//	Write a method that takes an integer and prints its multiplication table up to 10. Call the method using the class name.


	public static String myTable(int n) {
		
		String result ="Table of " + n +"\n";	
		
		for(int i=1;i<=10;i++) {
			
			result = result + (n + " x " + i + " = " + i*n +"\n");
			
		}
		return result;
		
	}
	public static void main(String[] args) {
		
		System.out.println(myTable(15));
	}
	
	

}
