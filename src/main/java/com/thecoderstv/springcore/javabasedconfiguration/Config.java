package com.thecoderstv.springcore.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Address address() {
		Address address = new Address();
		address.setCity("Kanpur New City");
		return address;
	}

	@Bean
	public Student student() {
		Student student = new Student();
		student.setSid(101);
		student.setName("Shubham Nigam");
		return student;
	}
}
