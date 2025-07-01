package com.jbk;

public class Student {

	int rollNo;
	String stuName;
	int stuAge;

	public Student(int rollNo, String stuName, int stuAge) {

		this.rollNo = rollNo;
		this.stuName = stuName;
		this.stuAge = stuAge;

	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}

}
