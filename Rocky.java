package com.techno.abstraction;

public class Rocky extends Dog {
	public void bark() {
		System.out.println("ba ba");
	}
	
	public Rocky(double weight,int nails, String breed){
		super(weight,nails,breed);
	}
	
	public void eat() {
		System.out.println("roti and milk, some biscuits");
	}
	
	public void bite() {
		System.out.println("It never bites but had sharp teeths");
	}

}
