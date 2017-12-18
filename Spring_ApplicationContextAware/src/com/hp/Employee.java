package com.hp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware,BeanNameAware {

	private String name;
	private int ID;
	private Address address;
	
	//
	
	private ApplicationContext context=null;
	
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
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context=applicationContext;
		
	}
	//executed first...coz initialez first so u can pass the memebr variable to the paramter to have certain thing initilized .
		//while the context is created ...
	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		
		System.out.println("Bean name is :" +beanName);
		
		
	}
	
}
