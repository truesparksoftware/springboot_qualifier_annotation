package com.truespark.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.truespark.Employee;

@Configuration
public class EmployeeConfiguration {

	@Bean("krishna")
	public Employee newEmployee1() {
		System.out.println("New bean is getting initialized");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("Krishna");
		emp.setLastName("Majety");
		return emp;
	}
	
	@Bean("ram")
	public Employee newEmployee2() {
		System.out.println("New bean is getting initialized");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("Ram");
		emp.setLastName("Gurram");
		return emp;
	}
}
