package com.questions;

import java.util.Scanner;

public class SumofDigit_CheckPrime {

	// Find the sum of digits using do-while loop and check if prime

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0, temp = num;
		do {
			sum += temp % 10;
			temp /= 10;
		} while (temp > 0);

		System.out.println("Sum of digits: " + sum);

		boolean isPrime = sum > 1;
		for (int i = 2; i * i <= sum; i++) {
			if (sum % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime ? "Prime" : "Not Prime");
		sc.close();

	}
}
