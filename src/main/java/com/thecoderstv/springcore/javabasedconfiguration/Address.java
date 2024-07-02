package com.thecoderstv.springcore.javabasedconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Address {
	
	private String city;

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
}
