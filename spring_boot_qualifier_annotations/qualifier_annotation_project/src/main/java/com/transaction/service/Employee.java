package com.transaction.service;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class Employee {
@MongoId
private String id;
private String name;
private String location;
}
