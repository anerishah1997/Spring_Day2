package com.lti.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lti.model.Address;
import com.lti.model.Employee;

@Configuration
public class JavaConfig {

	@Bean(name="employee")
	public Employee getEmployee(){
		return new Employee();
	}
	
	@Bean(name="address")
	public Address getAddress(){
		return new Address();
	}
}
