package com.thecoderstv.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection.xml");
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1);

	}
}
