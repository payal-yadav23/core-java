package com.theory;

public class ForLoops {

	/*
	 * syntax :- for(initialization ; condition ; update){ //block of code }
	 */
	public static void main(String[] args) {

		int num = 5;
		System.out.println("Table of " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}

	}

}
