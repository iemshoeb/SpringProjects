package com.Entity;

public class Employee {

	private int Id;
	private String name;
	private float salary;	
	
	public Employee() {
 
	}
	public Employee(int id, String name, float salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	
}
