package com.techno.springautowire;

public class Battery {

	String name = "toshiba";

	public void demo() {
		System.out.println("HELLO ALL WELCOME TO NEW YEAR OF YOUR LIFE");

	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Battery [name=" + name + "]";
	}

}
