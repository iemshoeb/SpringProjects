package com.Entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAO.EmployeeDAO;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDAO dao=(EmployeeDAO)context.getBean("edao");
		 boolean status= dao.saveEmployee(new Employee(108,"Amit",35000));  
		
		
//		 int status=dao.updateEmployee(new Employee(1,"Sonoo",15000)); 
//	     
		 /*Employee e=new Employee(); 
	    e.setId(102); 
	    int status=dao.deleteEmployee(e); 
	    System.out.println(status);*/  
		System.out.println(status);
		

	}

}
