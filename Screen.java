package com.techno.springautowire;

public class Screen {
	
	String name="amoled";

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Screen [name=" + name + "]";
	}
	
	

}
