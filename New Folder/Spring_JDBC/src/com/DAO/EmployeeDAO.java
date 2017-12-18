package com.DAO;
import com.Entity.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	
	private JdbcTemplate jdbcTemplate;

 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee e)
	{

	    String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')"; 
		return jdbcTemplate.update(query);
	}
	public int deleteEmployee(Employee e)
	{
		String query="delete from Employee where id ='"+e.getId()+"'";
		return jdbcTemplate.update(query);
	}
	public int updateEmployee(Employee e){  
	    String query="update Employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  

}
