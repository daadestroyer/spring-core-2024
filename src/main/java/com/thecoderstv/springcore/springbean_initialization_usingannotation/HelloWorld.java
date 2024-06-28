package com.thecoderstv.springcore.springbean_initialization_usingannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	@PostConstruct
	public void init() {
		System.out.println("Initializing spring bean");
		System.out.println("Adding some code");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroying spring bean");
	}
}
