package com.basic;

public class DataTypes {

	public static void main(String[] args) {

		// String is Non-Primitive data type

		String name = "Payal Yadav";

		// These are Primitive Data types

		byte age = 21;
		short rollno = 25;
		int batch_no = 1043;
		long mob_no = 8799854518L; // Always use uppercase 'L' when writing long values to avoid errors and improve
									// readability
		float percentage_12th = 91.17F; // Similarly like long for float always use uppercase F for float values
		double salary = 45000.00;
		char gender = 'F';
		boolean validity = true;

		System.out.println(name);
		System.out.println("Age: " + age);
		System.out.println("Roll no: " + rollno);
		System.out.println("batch no: " + batch_no);
		System.out.println("Mobile Number: " + mob_no);
		System.out.println("12th Percentage: " + percentage_12th);
		System.out.println("Salary: " + salary);
		System.out.println("Gender: " + gender);
		System.out.println("Validity: " + validity);

	}
}
