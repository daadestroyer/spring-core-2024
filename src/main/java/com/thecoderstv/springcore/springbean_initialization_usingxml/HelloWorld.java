package com.thecoderstv.springcore.springbean_initialization_usingxml;

public class HelloWorld {
	public void init() {
		System.out.println("Initializing spring bean");
		System.out.println("Adding some code");
	}

	public void destroy() {
		System.out.println("Destroying spring bean");
	}
}
