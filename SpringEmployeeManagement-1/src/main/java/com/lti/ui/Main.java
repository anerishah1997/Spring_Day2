package com.lti.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;

public class Main {

	public static void main(String[] args) {

		// only this when executed all objects in the beans are created, kept in context and ready to use
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Employee employee = context.getBean("employee",Employee.class);
		
		EmployeeService service = context.getBean("service",EmployeeService.class);
		/*boolean result = service.addEmployee(employee);
		if(result)
			System.out.println("Employee Added in in-memory database");
		else
			System.out.println("Employee not added");
		*/
		List<Employee> list = service.findAllEmployees();
		System.out.println(list);
	}

}
