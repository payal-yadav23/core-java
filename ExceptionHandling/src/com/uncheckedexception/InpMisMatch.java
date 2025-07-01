package com.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InpMisMatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you rollNo: ");
		int rollNo = 0;

		try {
			rollNo = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Enter valid info.. ");
		}

		System.out.println("rollNo: " + rollNo);

	}
}
