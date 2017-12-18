package com.hp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee  employee=(Employee)context.getBean("emp_obj");
		System.out.println(employee);


	}

}
