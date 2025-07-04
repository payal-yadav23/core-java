package com.jbk;

public class Employee {

	int empId;
	String empName;
	double empSalary;

	public Employee(int empId, String empName, double empSalary) {

		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;

		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);

	}

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Ram", 45000);
	}
	

}
