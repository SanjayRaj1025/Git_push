package com.techno.springautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("autowire(byName).xml");
		
		Laptop bean = app.getBean(Laptop.class);
		System.out.println(bean);
		bean.test();
	}

}
