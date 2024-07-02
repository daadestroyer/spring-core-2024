package com.thecoderstv.springcore.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MessageCustomBean message1 = (MessageCustomBean) context.getBean("messageCustomBean");
		MessageCustomBean message2 = (MessageCustomBean) context.getBean("messageCustomBean");
		MessageCustomBean message3 = (MessageCustomBean) context.getBean("messageCustomBean");
		Employee employee = (Employee) context.getBean("employee");

		System.out.println(message1.getMessage());
		System.out.println(employee);
		
		
		System.out.println(message1.hashCode());
		System.out.println(message2.hashCode());
		System.out.println(message3.hashCode());
		
	}
}
