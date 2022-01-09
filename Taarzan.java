package com.techno.abstractclass.loosecoupling;

public class Taarzan implements Car {

	@Override
	public void start() {
		System.out.println("taaaaaaaaaaaaaaarzaaan");
	}

	@Override
	public void accerate() {
		System.out.println("vrooom vrooom");
		
	}

	@Override
	public void brake() {
		System.out.println("kishki");
		
	}

}
