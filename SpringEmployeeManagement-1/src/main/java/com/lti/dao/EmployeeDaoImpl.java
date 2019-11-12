package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	// this is dependency, so spring framework is responsible for creating object of this via set method.
	private static List<Employee> employees;// creating in-memory db i.e when appln stops data will be gone..it will not store in db.
	// usually it should be static

	
	
	public EmployeeDaoImpl()
	{
		System.out.println("Dao object is created");
		//employees = new ArrayList<Employee>();
	}
	
	
    
	public static List<Employee> getEmployees() {
		return employees;
	}


    // for setter injection this will be called from xml config file
	public static void setEmployees(List<Employee> employees) {
		EmployeeDaoImpl.employees = employees;
	}



	public boolean createEmployee(Employee employee) {
		boolean result = employees.add(employee);
		return result;	}



	public List<Employee> readAllEmployees() {
		return employees;
	}
}
