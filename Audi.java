package com.techno.abstractclass.loosecoupling;

public class Audi implements Car {

	@Override
	public void start() {
		System.out.println("zun zun");
		
	}

	@Override
	public void accerate() {
		System.out.println("cooooool");
		
	}

	@Override
	public void brake() {
		System.out.println("kach kach");
		
	}
	

}
