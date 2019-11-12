package com.lti.service;

import java.util.List;



import com.lti.dao.EmployeeDao;
import com.lti.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	// reference of EmpDao and not created manually, spring will create it
	private EmployeeDao dao;


	public boolean addEmployee(Employee employee) {
		int result = dao.createEmployee(employee);
		if(result==1)
			return true;
		else
			return false;
	}

	public List<Employee> findAllEmployees() {
		
		return dao.readAllEmployees();
	}

	public boolean removeEmployee(int employeeId) {
		int result = dao.deleteEmployee(employeeId);
		if(result==1)
			return true;
		else
			return false;
	}

	public Employee modifyEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}

	
	
	public EmployeeDao getDao() {
		return dao;
	}

	// invoked when spring is creating service object as dao is the dependency of service class
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}
}
