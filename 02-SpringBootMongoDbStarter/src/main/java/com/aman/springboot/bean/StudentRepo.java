package com.aman.springboot.bean;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author aman.verma
 *
 */


// Model object for Spring Boot
@Document(collection = "studentRepo")
public class StudentRepo {

	@SuppressWarnings("unused")
	private ObjectId _id;
	@Id
	private int id;
	private String name;
	private String address;
	
	public StudentRepo() {
		super();
	}
	
	public StudentRepo(ObjectId _id, int id, String name, String address) {
		super();
		this._id = _id;
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}