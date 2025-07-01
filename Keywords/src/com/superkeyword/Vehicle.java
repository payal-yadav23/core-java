package com.superkeyword;

public class Vehicle {

	int id;
	String name;

	public Vehicle(int id, String name) {

		this.id = id;
		this.name = name;
		System.out.println("This is Vehicle class Constructor...");

	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + "]";
	}

	public void displayDetails() {
		System.out.println("Vehicle Details: " + toString());
	}

}
