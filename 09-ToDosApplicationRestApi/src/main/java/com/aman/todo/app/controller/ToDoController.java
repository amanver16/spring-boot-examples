package com.aman.todo.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.todo.app.model.ToDosModel;
import com.aman.todo.app.repository.ToDoRepository;

/**
 * @author aman.verma
 *
 */

@RestController
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.aman.todo.app.repository")
@RequestMapping(value = "/todo")
@CrossOrigin("*")
public class ToDoController {

	@Autowired
	private ToDoRepository toDoRepository;

	@GetMapping(value = "/todos")
	public List<ToDosModel> getAllToDos() {
		Sort sortByCreatedDate = new Sort(Sort.Direction.DESC, "createdDate");
		return toDoRepository.findAll(sortByCreatedDate);
	}

	@PostMapping(value = "/todos")
	public ToDosModel createToDo(@Valid @RequestBody ToDosModel toDosModel) {
		toDosModel.setIsCompleted(false); // First time toDo item is incomplete.
		return toDoRepository.save(toDosModel);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ToDosModel> getToDoById(@PathVariable("id") String id) {
		return toDoRepository.findById(id).map(todo -> ResponseEntity.ok().body(todo))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<ToDosModel> updateToDoById(@PathVariable("id") String id,
			@RequestBody ToDosModel toDosModel) {
		return toDoRepository.findById(id).map(todo -> {
			todo.setTitle(toDosModel.getTitle());
			todo.setIsCompleted(toDosModel.getIsCompleted());
			ToDosModel updatedToDosModel = toDoRepository.save(todo);
			return ResponseEntity.ok().body(updatedToDosModel);
		}).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deleteToDoById(@PathVariable("id") String id) {
		return toDoRepository.findById(id).map(todo -> {
			toDoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}
