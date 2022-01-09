package com.techno.arraylistinternalimplementation;

import java.util.ArrayList;
import java.util.Collections;

public class Company {
	public static void main(String[] args) {
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		Employee e=new Employee(1,"SANJAY",30000);
		arrayList.add(e);
		arrayList.add(new Employee(2,"SANJANA",40000));
		arrayList.add(new Employee(3,"SHASHI",50000));
		System.out.println(arrayList);
		arrayList.add(2,e);
		arrayList.set(2,new Employee(5,"TANGO",80000));
		System.out.println(arrayList);
		
	
		
	}

}
