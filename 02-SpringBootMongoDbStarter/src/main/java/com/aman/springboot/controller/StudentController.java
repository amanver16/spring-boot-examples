package com.aman.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aman.springboot.bean.StudentRepo;
import com.aman.springboot.repository.StudentRepository;

/**
 * @author aman.verma
 *
 */

@RestController
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.aman.springboot.repository")
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping(value = "/getStudents", method = RequestMethod.GET)
	public List<StudentRepo> getAllStudents() {
		return studentRepository.findAll();
	}

	@RequestMapping(value = "/getStudent", method = RequestMethod.GET)
	public StudentRepo getStudent(@RequestParam(required = true) int id) {
		return studentRepository.findStudentById(id);
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public void addStudent(@RequestBody(required = true) StudentRepo studentRepo) {
		studentRepository.addStudent(studentRepo);
	}

	@RequestMapping(value = "/removeStudent", method = RequestMethod.POST)
	public void removeStudent(@RequestBody(required = true) StudentRepo studentRepo) {
		studentRepository.removeStudent(studentRepo);
	}

	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public void updateStudent(@RequestBody(required = true) StudentRepo studentRepo) {
		studentRepository.updateStudent(studentRepo);
	}

	@RequestMapping(value = "/searchStudent", method = RequestMethod.POST)
	public StudentRepo searchStudent(@RequestBody(required = true) StudentRepo studentRepo) {
		return studentRepository.searchStudent(studentRepo);
	}

}
