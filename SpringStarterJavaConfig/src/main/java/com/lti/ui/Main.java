package com.lti.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lti.config.JavaConfig;
import com.lti.model.Address;
import com.lti.model.Employee;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee);
		System.out.println(employee.getAddress());
		employee=null;
		Thread.sleep(1000);
		System.gc();
	}

}
