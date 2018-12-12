package com.aman.springboot.student.controller;

import java.util.List;

import com.aman.springboot.student.bean.StudentBean;
import com.aman.springboot.student.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aman.verma
 *
 */

@RestController
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.aman.springboot.student.repository")
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping(value = "/getStudents", method = RequestMethod.GET)
	public List<StudentBean> getAllStudents() {
		return studentRepository.findAll();
	}

	@RequestMapping(value = "/getStudent", method = RequestMethod.GET)
	public StudentBean getStudent(@RequestParam(required = true) int id) {
		return studentRepository.findStudentById(id);
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public void addStudent(@RequestBody(required = true) StudentBean studentBean) {
		studentRepository.addStudent(studentBean);
	}

	@RequestMapping(value = "/removeStudent", method = RequestMethod.POST)
	public void removeStudent(@RequestBody(required = true) StudentBean studentBean) {
		studentRepository.removeStudent(studentBean);
	}

	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public void updateStudent(@RequestBody(required = true) StudentBean studentBean) {
		studentRepository.updateStudent(studentBean);
	}

	@RequestMapping(value = "/searchStudent", method = RequestMethod.POST)
	public StudentBean searchStudent(@RequestBody(required = true) StudentBean studentBean) {
		return studentRepository.searchStudent(studentBean);
	}

}
