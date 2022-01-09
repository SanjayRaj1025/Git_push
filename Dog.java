package com.techno.abstraction;

public abstract class Dog {
	
	abstract void bark();
	abstract void bite();
	abstract void eat();
	
	int nails;
	double weight;
	String breed;
	
	
	public Dog(double weight,int nails, String breed) {
		this.nails = nails;
		this.weight = weight;
		this.breed = breed;
	}
	public void poop() {
		System.out.println("It is pooping");
	}

}
