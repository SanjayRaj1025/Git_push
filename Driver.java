package com.techno.abstractclass.loosecoupling;

public class Driver {
	Car car;

	public void drive(String s) {
		if (s.equalsIgnoreCase("audi")) {
			car = new Audi();
			car.start();
			car.accerate();
			car.brake();

		}

		if (s.equalsIgnoreCase("taarzan")) {
			car = new Taarzan();
			car.start();
			car.accerate();
			car.brake();
		}

		if (s.equalsIgnoreCase("rollsroyce")) {
			car = new Rollsroyace();
			car.start();
			car.accerate();
			car.brake();
		}
	}

}
