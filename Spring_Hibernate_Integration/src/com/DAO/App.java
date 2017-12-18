package com.DAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDAO dao=(EmployeeDAO)context.getBean("d");
		
		Employee  employee=new Employee();
		employee.setId(1);
		employee.setName("ZOehb");
		employee.setSalary(200000);
		
		dao.saveEmployee(employee);

	}

}
