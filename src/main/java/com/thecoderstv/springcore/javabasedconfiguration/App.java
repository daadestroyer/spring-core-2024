package com.thecoderstv.springcore.javabasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
}
