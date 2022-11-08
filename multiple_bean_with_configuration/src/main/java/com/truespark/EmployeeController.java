package com.truespark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truespark.interfac.ApplicationBase;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	@Qualifier("krishna")
	private Employee emp1;

	@Autowired
	@Qualifier("ram")
	private Employee emp2;
	
	
	@Autowired
	@Qualifier("firstapp")
	private ApplicationBase applicationBase;
	
	@GetMapping("/getbean")
	public void getBean() {
		emp1.toString();
		emp2.toString();
	}
	
	
	
	@GetMapping("/application")
	public void getApplicationBase() {
		applicationBase.printApplicationBase();
		
	}
}
