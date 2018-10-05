package com.aman.springboot.hibernate.proceduredemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.springboot.hibernate.proceduredemo.repository.UserRepository;

/**
 * @author aman.verma
 *
 */

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	// Return output in Json format
	@GetMapping(value = "/getUsers")
	public List<Object[]> getUsers() {
		return userRepository.getUserInformation();
	}

}
