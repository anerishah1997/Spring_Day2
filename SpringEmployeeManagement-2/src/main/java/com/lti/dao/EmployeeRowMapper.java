package com.lti.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lti.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		System.out.println("mapRow() called for converting one row into obj");
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getInt("EMP_ID"));
		employee.setEmployeeName(rs.getString("Emp_Name"));
		employee.setEmployeeSalary(rs.getDouble("Emp_Sal"));
		return employee;
	}

}
