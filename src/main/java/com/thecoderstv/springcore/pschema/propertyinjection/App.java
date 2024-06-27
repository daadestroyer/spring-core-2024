package com.thecoderstv.springcore.pschema.propertyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// in this program we are injecting primitive data type using property injection using p - schema
		
		ApplicationContext context = new ClassPathXmlApplicationContext("pschemconfig.xml");
		
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
		
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		
		Student student3 = (Student) context.getBean("stud1");
		System.out.println(student3);



		 
	}
}
