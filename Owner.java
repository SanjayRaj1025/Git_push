package com.techno.abstraction;

public class Owner {
	public static void main(String[] args) {
		
		Rocky r = new Rocky(42,25,"hush");
		r.bark();
		r.bite();
		r.eat();
		r.poop();
		
		System.out.println("**********");
		
		Zoey z = new Zoey(40,22,"labrodor");
		z.bark();
		z.bite();
		z.eat();
		z.poop();
		
		
	}

}
