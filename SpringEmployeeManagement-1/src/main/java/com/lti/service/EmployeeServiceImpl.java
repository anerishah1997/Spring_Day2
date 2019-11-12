package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.lti.dao.EmployeeDao;
import com.lti.dao.EmployeeDaoImpl;
import com.lti.model.Employee;

public class EmployeeServiceImpl implements EmployeeService,InitializingBean, DisposableBean {

	// this is dependency, so spring framework is responsible for creating object of this via set method.
	private EmployeeDao dao;
	
	public EmployeeServiceImpl(){
		System.out.println("Service object created");
	}
	
	public EmployeeDao getDao() {
		return dao;
	}

	// this method is called when it will execute the property tag of service bean
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	public boolean addEmployee(Employee employee) {
		return dao.createEmployee(employee);
	}

	public List<Employee> findAllEmployees() {
		return dao.readAllEmployees();
	}

	public void afterPropertiesSet() throws Exception {
       System.out.println("Init");		
	}

	public void destroy() throws Exception {

		System.out.println("destroyed");
	}
	

}
