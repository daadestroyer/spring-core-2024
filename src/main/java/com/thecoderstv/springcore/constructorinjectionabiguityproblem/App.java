package com.thecoderstv.springcore.constructorinjectionabiguityproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjectionabiguityproblem.xml");
		Addition add1 = (Addition) context.getBean("add1");
		System.out.println("Sum is = " + add1.doSum());
	}
}
