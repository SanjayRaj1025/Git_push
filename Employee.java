package com.techno.assignments;

public class Employee {

	private int id;
	private String name;
	private double salary;
	static int count = 0;
	{
		count++;
		System.out.println("welcome");
	}

	public void getid() {
		System.out.println("Id:" + count);

	}

	public void getname() {
		System.out.println("name:" + name);
	}

	public void getsalary() {
		System.out.println("salary:" + salary);

	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setid(int id) {

		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
