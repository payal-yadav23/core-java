package com.jbk;

public class Rectangle {

	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;

		int area = length * breadth;

		System.out.println("Area of Reactngle : " + area);
	}

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(15, 10);

	}
}
