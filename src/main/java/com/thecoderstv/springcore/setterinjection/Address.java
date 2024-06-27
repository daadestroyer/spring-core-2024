package com.thecoderstv.springcore.setterinjection;

public class Address {
	private String pincode;
	private String city;
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}
	
	
}
