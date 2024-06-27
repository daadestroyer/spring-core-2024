package com.thecoderstv.springcore.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		// in this program we are injecting primitive data type using setter injection
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);

		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);

		Address addr1 = (Address) context.getBean("addr1");
		System.out.println(addr1);
	}
}
