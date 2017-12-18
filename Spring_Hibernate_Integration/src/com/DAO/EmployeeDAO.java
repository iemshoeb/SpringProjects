package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate; 

 


import com.Entity.Employee;

public class EmployeeDAO {

		HibernateTemplate hibernateTemplate;

		public EmployeeDAO(HibernateTemplate hibernateTemplate) {
			super();
			this.hibernateTemplate = hibernateTemplate;
		}
		
		public void saveEmployee(Employee e)
		{
			hibernateTemplate.save(e);
		}
		//method to update employee  
		public void updateEmployee(Employee e){  
			hibernateTemplate.update(e);  
		}  
		//method to delete employee  
		public void deleteEmployee(Employee e){  
			hibernateTemplate.delete(e);  
		}  

		   
		public Employee getById(int id){  
		    Employee e=(Employee)hibernateTemplate.get(Employee.class,id);  
		    return e;  
		}  
		//method to return all employees  
		public List<Employee> getEmployees(){  
		    List<Employee> list=new ArrayList<Employee>();  
		    list=hibernateTemplate.loadAll(Employee.class);  
		    return list;  
		}  
		
}
