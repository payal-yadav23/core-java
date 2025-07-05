package com.questions;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = new StringBuilder(str).reverse().toString();
		if (str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}

}
