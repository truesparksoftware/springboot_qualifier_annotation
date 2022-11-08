package com.transaction.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.transaction.service.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
