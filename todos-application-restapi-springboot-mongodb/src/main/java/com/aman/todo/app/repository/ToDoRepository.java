package com.aman.todo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aman.todo.app.model.ToDosModel;

public interface ToDoRepository extends MongoRepository<ToDosModel, String> {
	// To Do Repository
}
