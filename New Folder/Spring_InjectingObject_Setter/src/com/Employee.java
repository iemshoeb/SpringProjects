package com;

public class Employee {

	private int SSN;
	private String name;

	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	 
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		
	System.out.println(getName()+" "+getSSN()+" "+address);	
			}
	

}
