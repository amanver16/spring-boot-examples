package com.aman.solid.isp.service;

import org.springframework.stereotype.Service;

import com.aman.solid.isp.athlete.Athlete;
import com.aman.solid.isp.athlete.Swimmers;

/**
 * @author aman.verma
 *
 */

@Service
public class SwimmersService implements Athlete, Swimmers {

	@Override
	public String swim() {
		return "in swimming";
	}
	
	@Override
	public String compete() {
		return "started competing";
	}
	
}
