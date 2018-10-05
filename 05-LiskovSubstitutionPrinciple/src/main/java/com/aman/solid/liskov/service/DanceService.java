package com.aman.solid.liskov.service;

import org.springframework.stereotype.Service;

import com.aman.solid.liskov.bean.PeopleBean;

/**
 * @author aman.verma
 *
 */

@Service
public class DanceService {

	public String letThemDance(PeopleBean peopleBean) {
		if (peopleBean.canDance()) {
			return peopleBean.getName() + " is dancing.";
		} else {
			return peopleBean.getName() + " is not dancing.";
		}
	}
}
