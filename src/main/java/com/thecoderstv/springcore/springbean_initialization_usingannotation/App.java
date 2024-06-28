package com.thecoderstv.springcore.springbean_initialization_usingannotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext cfa = new ClassPathXmlApplicationContext(
				"springbean_initialization_usingannotation.xml");
		Thread.sleep(2000);
		cfa.close();
	}
}
