package com.spring;

public class Address {

	private String city,Country,addressLine1;

	public Address(String addressline1,String city,String Country)
	{
		super();
		 this.addressLine1=addressline1;
		this.city=city;
		this.Country=Country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", Country=" + Country + ", addressLine1=" + addressLine1 + "]";
	}
	 	 
}
