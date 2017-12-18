package com.DAO;
import com.Entity.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDAO {
	
	private JdbcTemplate jdbcTemplate;

 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean saveEmployee(final Employee e)
	{
	    String query="insert into Employee values(?,?,?)";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	        @Override  
	        public Boolean doInPreparedStatement(PreparedStatement ps)  
	                throws SQLException, DataAccessException {  
	                  
	            ps.setInt(1,e.getId());  
	            ps.setString(2,e.getName());  
	            ps.setFloat(3,e.getSalary());  
	                  
	            return ps.execute();  
	                  
	        }  
	        });   
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
