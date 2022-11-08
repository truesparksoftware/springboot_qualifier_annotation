package com.transaction.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.transaction.service.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
