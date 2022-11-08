package com.transaction.qualifier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.transaction.repository.EmployeeRepository;
import com.transaction.service.Employee;


//@Service
//@Qualifier("employee")
//@Service("employee")
@Component("employee")
public class EmployeeServiceImpl implements BusinessService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAll(){
		System.out.print("Employee service class");
		   List<Employee> allStudent=employeeRepository.findAll();
		return allStudent;
	}
}





