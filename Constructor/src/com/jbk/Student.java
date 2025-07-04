package com.jbk;

public class Student {

	int stuID;
	String stuName;
	String stuDept;
	
	public Student(int stuID , String stuName,String stuDept) {
		
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuDept = stuDept;
		
		
	}

	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", stuName=" + stuName + ", stuDept=" + stuDept + "]";
	}
	
	
}
