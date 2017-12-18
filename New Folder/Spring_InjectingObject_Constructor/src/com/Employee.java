package com;

public class Employee {

	private int SSN;
	private String name;
	 
	private Address address;
	
	public Employee(int ssn,String name,Address add) {
		super();
		this.SSN=ssn;
		this.name=name;
		this.address=add;
	}

	
	public void showInfo() {
		System.out.println(SSN+" "+name+" "+address);
	}

	 

	 
	

}
