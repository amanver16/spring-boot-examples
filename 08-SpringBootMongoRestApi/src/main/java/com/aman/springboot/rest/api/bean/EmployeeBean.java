package com.aman.springboot.rest.api.bean;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author aman.verma
 *
 */

@Document(collection = "employee")
public class EmployeeBean {

	@Id
	private ObjectId _id;
	private String code;
	private String name;
	private String gender;
	private double annualSalary;
	private String dateOfBirth;

	public EmployeeBean() {
		super();
	}

	public EmployeeBean(String code, String name, String gender, double annualSalary, String dateOfBirth) {

		this.code = code;
		this.name = name;
		this.gender = gender;
		this.annualSalary = annualSalary;
		this.dateOfBirth = dateOfBirth;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "EmployeeBean [code=" + code + ", name=" + name + ", gender=" + gender + ", annualSalary=" + annualSalary
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

}
