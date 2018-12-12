package com.aman.springboot.employee.bean;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author aman.verma
 *
 */

@Data
@Document(collection = "employee")
public class EmployeeBean {

	@Id
	private ObjectId _id;
	private String code;
	private String name;
	private String gender;
	private double annualSalary;
	private String dateOfBirth;

}
