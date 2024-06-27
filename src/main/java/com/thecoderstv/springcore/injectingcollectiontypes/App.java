package com.thecoderstv.springcore.injectingcollectiontypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// in this program we are injecting collection data type using setter injection
		ApplicationContext context = new ClassPathXmlApplicationContext("injectingcollectiontypes.xml");

		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp);

	}
}
