package com.jbk;

public class StudentDetails {

	public static void main(String[] args) {

		Student stu = new Student(101, "payal", "entc");
		Student stu1 = new Student(2, "Shreya", "comp");

		System.out.println(stu);
		System.out.println(stu1);

		System.out.println(stu.equals(stu));
		
		System.out.println(stu1.hashCode());
		System.out.println(stu.hashCode());
		
		System.out.println(stu.getClass());
		
		System.out.println(stu.toString());
		
		

	}
}
