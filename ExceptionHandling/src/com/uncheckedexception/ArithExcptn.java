package com.uncheckedexception;

import java.util.Scanner;

public class ArithExcptn {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int div = 0;
		try {
			div = n1 / n2;
		} catch (ArithmeticException e) {
			System.out.println("Division: " + div);
			System.out.println("Cannot divide by zero..");
		} finally {
			System.out.println("Exception handled...");
		}

	}

}
