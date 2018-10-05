package com.aman.solid.liskov.service;

import com.aman.solid.liskov.behavior.LetsDance;

/**
 * @author aman.verma
 *
 */

public class People implements LetsDance {

	public String eat() {
		return "I love food.";
	}

	@Override
	public String dance() {
		return "People may dance";
	}
}
