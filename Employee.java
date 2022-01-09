package com.techno.streamapi;

public class Employee {
	int empid;
	String empname;
	double salary;
	String designation;
	int age;

	public Employee(int empid, String empname, double salary, String designation, int age) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.designation = designation;
		this.age = age;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", designation="
				+ designation + ", age=" + age + "]";
	}

}
