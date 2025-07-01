package com.throwkeyword;

import java.util.Scanner;

public class CustomException extends ArithmeticException {

	public CustomException(String str) {
		super(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		try {
			if (num2 == 0) {
				throw new CustomException("WARNING!!!!!!  cannot divide by 0");
			}
			int div = num1 / num2;
			System.out.println("Result: "+div);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
