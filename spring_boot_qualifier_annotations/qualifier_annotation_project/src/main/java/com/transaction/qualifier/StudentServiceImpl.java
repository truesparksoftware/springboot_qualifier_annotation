package com.transaction.qualifier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.transaction.repository.StudentRepository;
import com.transaction.service.Student;


//@Service
//@Qualifier("student")
//@Service("student")
@Component("student")
public class StudentServiceImpl implements BusinessService{
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAll(){
		System.out.print("Student service class");
		   List<Student> allStudent=studentRepository.findAll();
		return allStudent;
	}
}






