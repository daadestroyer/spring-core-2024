package com.thecoderstv.springcore.injectingreferencetypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// in this program we are injecting primitive data type using setter injection
		ApplicationContext context = new ClassPathXmlApplicationContext("injectingreferencetype.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);

	}
}
