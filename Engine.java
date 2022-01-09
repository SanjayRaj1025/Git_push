package com.techno.spring;

public class Engine implements Garage {
	String name;
	double capacity;

	public Engine(String name, double capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}

	@Override
	public void start() {
		System.out.println(name+" Engine has started"+" and the capacity is\t"+capacity);
	}

}
