package com.questions;

public class RemoveWhitespace {

	public static void main(String[] args) {
		String str = " Hello World Java ";
		String result = str.replaceAll("\\s+", "");
		System.out.println("String without spaces: " + result);
	}
}
