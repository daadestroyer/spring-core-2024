package com.thecoderstv.springcore.autowiring_usingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring_usingannotation.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
	}
}
