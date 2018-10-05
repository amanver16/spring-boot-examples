package com.aman.springboot.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.springboot.rest.api.bean.EmployeeBean;
import com.aman.springboot.rest.api.repository.EmployeeRepository;

/**
 * @author aman.verma
 *
 */

@RestController
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.aman.springboot.rest.api.repository")
@RequestMapping(value = "/employee")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping(value = "/getEmployees")
	public List<EmployeeBean> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
