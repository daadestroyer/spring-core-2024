package com.thecoderstv.springcore.springbean_initialization_usinginterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {

	public void afterPropertiesSet() throws Exception {
		// init method
		System.out.println("Spring Bean is going to initialize now");
		System.out.println("Adding some code");
	}

	public void destroy() throws Exception {
		System.out.println("Spring bean is going to destroy now");

	}

}
