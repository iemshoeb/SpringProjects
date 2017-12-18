package com.spring;

public class Employee {

	private int SSN;
	private String name;
	private Address address;

	public Employee()
	{
		
	}
	public Employee(int ssn,String name)
	{

		super();
		this.SSN=ssn;
		this.name=name;
	}
	
	public Employee(int ssn,String name,Address add)
	{
		this.SSN=ssn;
		this.name=name;
		this.address=add;
	}
	 
	void show(){  
	    System.out.println(SSN+" "+name);  
	    System.out.println(address);  
	}  
}
