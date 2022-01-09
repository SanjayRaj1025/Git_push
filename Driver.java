package com.techno.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("configuration.xml");
		Car bean = container.getBean(Car.class);
		bean.move();
	}

}
