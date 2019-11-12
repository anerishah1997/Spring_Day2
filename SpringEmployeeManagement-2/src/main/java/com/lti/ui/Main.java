package com.lti.ui;

import java.util.List;
import java.util.Scanner;

import org.omg.PortableServer.LifespanPolicyOperations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService service=context.getBean("service",EmployeeService.class);
		Employee employee=context.getBean("employee", Employee.class) ;
		
		// taking data from user and storing it in employee
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee Name: ");
		employee.setEmployeeName(sc.next());
		System.out.println("Enter employee salary: ");
		employee.setEmployeeSalary(sc.nextDouble());
		boolean result = service.addEmployee(employee);
		if(result)
		{
			List<Employee> list = service.findAllEmployees();
			for(Employee e : list)
				System.out.println(e);
		}
		else{
			System.out.println("Employee data not saved");
		}

	}

}
