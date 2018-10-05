package com.aman.solid.liskov.bean;

/**
 * @author aman.verma
 *
 */

public class PeopleBean {

	private String name;
	private boolean canDance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean canDance() {
		return canDance;
	}

	public void setCanDance(boolean canDance) {
		this.canDance = canDance;
	}
}