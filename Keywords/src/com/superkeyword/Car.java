package com.superkeyword;

public class Car extends Vehicle {

	public Car() {

		super(101, "BMW"); // Calls vehicle parameterized constructor
		System.out.println(super.toString()); // calls toString() method of Vehicle class
		System.out.println("This is Car class Constructor..");
	}

	@Override
	public void displayDetails() {

		super.displayDetails(); // override parent class method
	}

	public static void main(String[] args) {

		Car c = new Car();
		c.displayDetails();
	}

}
