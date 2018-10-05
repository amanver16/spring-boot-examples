package com.aman.solid.liskov.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.solid.liskov.bean.PeopleBean;
import com.aman.solid.liskov.service.DanceService;
import com.aman.solid.liskov.service.Dancers;
import com.aman.solid.liskov.service.NonDancers;
import com.aman.solid.liskov.service.People;

/**
 * @author aman.verma
 *
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/danceIndiaDance")
public class DanceController {

	@Autowired
	private DanceService danceService;

	@PostMapping(value = "/wannaDance")
	public List<String> wannaDance(@RequestBody List<PeopleBean> peopleBeanList) {

		List<String> peopleStatus = new ArrayList<>();
		for (PeopleBean peopleBean : peopleBeanList) {
			
			if (peopleBean.canDance()) {
				People people = new Dancers();
				peopleStatus.add(peopleBean.getName() + " : " + people.eat());
				peopleStatus.add(peopleBean.getName() + " : " + people.dance());
			} else {
				People people = new NonDancers();
				peopleStatus.add(peopleBean.getName() + " : " + people.eat());
				peopleStatus.add(peopleBean.getName() + " : " + people.dance());
			}

			peopleStatus.add(danceService.letThemDance(peopleBean));
		}

		return peopleStatus;
	}
}
