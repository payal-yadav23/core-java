package com.questions;

public class Vowels_Consonant {

//	-------------------Check vowels and Consonant using switch case and for loop---------------------------
	public static void main(String[] args) {

		char ch = 'i';

		for (int i = 0; i < 1; i++) {
			switch (ch) {
			case 'a', 'e', 'i', 'o', 'u':
				System.out.println("This is vowel");
				break;
			case 'A', 'B', 'I', 'O', 'U':
				System.out.println("This is vowel");
				break;
			default:
				System.out.println("Its a consonant");
			}

		}
	}
}
