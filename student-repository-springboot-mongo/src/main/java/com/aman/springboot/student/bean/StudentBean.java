package com.aman.springboot.student.bean;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author aman.verma
 *
 */

// Model object for Spring Boot
@Data
@Document(collection = "studentRepo")
public class StudentBean {

	private ObjectId _id;
	@Id
	private int id;
	private String name;
	private String address;

}