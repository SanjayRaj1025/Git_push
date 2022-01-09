package com.techno.encapsulation;

public class Employee {
	
	private int empid;
	private String empname;
	private int age;
	private static String designation;
	
	public void setAge(int age) {
		if(age>0&&age<100) {
			this.age=age;
		}
		
		else {
			System.out.println("invalid age");
		}
	}
	
	public void getAge() {
		System.out.println(age);
	}
	
	public void setempid(int empid) {
		this.empid=empid;
	}
	
	public void getempid() {
		System.out.println(empid);
	}
	
	public void setempname(String empname) {
		this.empname=empname;
	}
	
	public void getempname() {
		System.out.println(empname);
	}
	
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	public void getdesignation() {
		System.out.println(designation);
	}

}
