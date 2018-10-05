package com.aman.solid.liskov.service;

/**
 * @author aman.verma
 *
 */

public class NonDancers extends People {

	@Override
	public String dance() {
		return "I can't Dance";
	}
}