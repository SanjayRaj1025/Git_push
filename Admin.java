package com.techno.encapsulation;

public class Admin {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		
		employee1.setAge(23);
		employee1.getAge();
		employee1.setempname("sanjay");
		employee1.getempname();
		employee1.setempid(1);
		employee1.getempid();
		employee1.setDesignation("associate software engineer");
		employee1.getdesignation();
		
		System.out.println("**********");
		
Employee employee2 = new Employee();
		
		employee2.setAge(25);
		employee2.getAge();
		employee2.setempname("sanjana");
		employee2.getempname();
		employee2.setempid(2);
		employee2.getempid();
		employee2.setDesignation("associate software engineer");
		employee2.getdesignation();
		
	}

}
