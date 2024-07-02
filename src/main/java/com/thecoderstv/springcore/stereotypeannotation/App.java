package com.thecoderstv.springcore.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MessageCustomBean message = (MessageCustomBean) context.getBean("messageCustomBean");
		Employee employee = (Employee) context.getBean("employee");

		System.out.println(message.getMessage());
		System.out.println(employee);
	}
}
