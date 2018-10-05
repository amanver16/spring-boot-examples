package com.aman.solid.liskov.service;

import org.springframework.stereotype.Service;

/**
 * @author aman.verma
 *
 */

@Service
public class Dancers extends People {
	
	@Override
	public String dance() {
		return "I can Dance";
	}
}
