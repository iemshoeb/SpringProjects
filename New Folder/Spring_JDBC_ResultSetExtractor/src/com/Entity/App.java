package com.Entity;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAO.EmployeeDAO;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDAO dao=(EmployeeDAO)context.getBean("edao");
		 List<Employee> list=dao.getAllEmployees();  
         
		    for(Employee e:list)  
		        System.out.println(e);  

	}

}
