package com.spring;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e1=(Employee)context.getBean("e2");
		e1.show();

	}

}
