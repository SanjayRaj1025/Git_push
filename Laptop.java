package com.techno.springautowire;

public class Laptop {
	Battery b;
	Screen s;

	public void test() {
		b.demo();

	}

	public void setB(Battery b) {
		this.b = b;
	}

	public void setS(Screen s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Laptop [b=" + b + ", s=" + s + "]";
	}

}
