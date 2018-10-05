package com.aman.solid.isp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.solid.isp.bean.AthleteBean;
import com.aman.solid.isp.service.JumpersService;
import com.aman.solid.isp.service.RacersService;
import com.aman.solid.isp.service.SwimmersService;

/**
 * @author aman.verma
 *
 */

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/athlete")
public class AthleteController {

	@Autowired
	private JumpersService jumpersService;
	
	@Autowired
	private SwimmersService swimmersService;
	
	@Autowired
	private RacersService racersService;
	
	@PostMapping(value = "/jump")
	public String startJump(@RequestBody AthleteBean athleteBean) {
		return athleteBean.getAthleteName() + " " + jumpersService.compete() + " " + jumpersService.longJump();
	}
	
	@PostMapping(value = "/swim")
	public String startSwimming(@RequestBody AthleteBean athleteBean) {
		return athleteBean.getAthleteName() + " " + swimmersService.compete() + " " + swimmersService.swim();
	}

	@PostMapping(value = "/race")
	public String startRacing(@RequestBody AthleteBean athleteBean) {
		return athleteBean.getAthleteName() + " " + racersService.compete() + " " + racersService.sprint();
	}
	
}
