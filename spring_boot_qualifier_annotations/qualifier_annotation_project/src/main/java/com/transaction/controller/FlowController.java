package com.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.qualifier.BusinessService;
import com.transaction.service.Student;

@RestController
@RequestMapping("/business")
public class FlowController {

	@Autowired
	@Qualifier("student")
	BusinessService studentService;
	
	@Autowired
	@Qualifier("employee")
	BusinessService employeeService;
	
	
	
	@GetMapping("/getallstudent")
	public List<Student> getAllStudent(){
		List<Student> studentList=studentService.getAll();
		return studentList;
	}
	
	@GetMapping("/getallemployee")
	public List<Student> getAllEmployee(){
		List<Student> empList=employeeService.getAll();
		return empList;
	}
	
}