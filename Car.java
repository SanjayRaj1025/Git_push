package com.techno.spring;

public class Car {
	Garage e;

	public Car(Garage e) {
		super();
		this.e = e;

	}

	public void move() {
		e.start();
		System.out.println("Car is moving");

	}
}
