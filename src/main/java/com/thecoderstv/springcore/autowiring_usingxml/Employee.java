package com.thecoderstv.springcore.autowiring_usingxml;

public class Employee {
	private int empId;
	private String empName;
	private Address address;

	public Employee(int empId, String empName, Address address) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

}
