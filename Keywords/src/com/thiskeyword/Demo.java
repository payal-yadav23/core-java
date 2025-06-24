package com.thiskeyword;

public class Demo {

	protected Demo() {
		System.out.println("this is non para.. cnstr..");
	}

	Demo(int a) {
		this(); // at the time of contr calling through this() //keyword remember you write this
				// in first line

		System.out.println("this is para..1 cnstr..");
	}

	Demo(int a, int b) {
		this(1);
		System.out.println("this is para..1.2 cnstr..");
	}

	Demo(int a, int b, int c) {
		this(2, 2);
		System.out.println("this is para..1.3 cnstr..");
	}

	public static void main(String[] args) {
		Demo d = new Demo(1, 2, 3);
	}

}
