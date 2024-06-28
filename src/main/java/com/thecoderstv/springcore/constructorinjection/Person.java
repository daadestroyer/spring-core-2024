package com.thecoderstv.springcore.constructorinjection;

import java.util.List;

public class Person {
	private int personId;
	private String personName;
	private List<String> phone;
	private Cert cert;
	
	
	public Person(int personId, String personName, List<String> phone, Cert cert) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.phone = phone;
		this.cert = cert;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", phone=" + phone + ", cert=" + cert
				+ "]";
	}
	
	
	 
	 

}
