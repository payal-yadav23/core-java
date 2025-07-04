package com.jbk;

public class Circle {

	int radius;

	public Circle(int radius) {

		this.radius = radius;
		float pi = 3.14f;
		float area = 2 * pi * radius * radius;

		System.out.println("Area of Circle: " + area);
	}

	public static void main(String[] args) {

		Circle c = new Circle(5);

	}
}
