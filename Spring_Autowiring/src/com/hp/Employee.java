package com.hp;

public class Employee {

	private String name;
	private int ID;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ID=" + ID + ", address="+" City =" + address.getCity() +" ZipCode= " +address.getZipCode() +"]";
	}
	
}
