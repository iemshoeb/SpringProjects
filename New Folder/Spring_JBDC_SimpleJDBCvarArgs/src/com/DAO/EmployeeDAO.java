package com.DAO;
import com.Entity.*;

import java.sql.PreparedStatement;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.PreparedStatementCallback;  
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.util.*;  
public class EmployeeDAO {
	 
	@SuppressWarnings("deprecation")
	SimpleJdbcTemplate jdbcTemplate;
	
	public EmployeeDAO(SimpleJdbcTemplate template) {  
        this.jdbcTemplate = template;  
}  
	@SuppressWarnings("deprecation")
	public int update (Employee e){  
		String query="update employee set name=? where id=?";  
		return jdbcTemplate.update(query,e.getName(),e.getId());  
		  
		//String query="update employee set name=?,salary=? where id=?";  
		//return template.update(query,e.getName(),e.getSalary(),e.getId());  
		}  
}
