package com.techno.abstraction;

public class Zoey extends Dog {

	@Override
	void bark() {
		System.out.println("bow bow");
		
	}
	
	public Zoey(double weight,int nails, String breed){
		super(weight,nails,breed);
	}

	@Override
	void bite() {
		System.out.println("no biting process");
		
	}

	@Override
	void eat() {
		System.out.println("curd rice and egg");
		
	}
	
	

}
