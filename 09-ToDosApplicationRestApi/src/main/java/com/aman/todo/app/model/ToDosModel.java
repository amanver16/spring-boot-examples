package com.aman.todo.app.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author aman.verma
 *
 */

@Document(collection = "todos")
@JsonIgnoreProperties(value = { "createdAt" }, allowGetters = true)
public class ToDosModel {

	@Id
	private String id;

	@Indexed(unique = true)
	@Size(max = 100)
	@NotBlank
	private String title;

	private boolean isCompleted;
	private Date createdDate;

	public ToDosModel() {
		super();
	}

	public ToDosModel(String id, @Size(max = 100) @NotBlank String title, boolean isCompleted) {
		super();
		this.id = id;
		this.title = title;
		this.isCompleted = isCompleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "ToDosModel [id=" + id + ", title=" + title + ", isCompleted=" + isCompleted + "]";
	}

}
