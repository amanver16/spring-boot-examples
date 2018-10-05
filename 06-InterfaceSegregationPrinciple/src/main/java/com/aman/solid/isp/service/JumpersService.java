package com.aman.solid.isp.service;

import org.springframework.stereotype.Service;

import com.aman.solid.isp.athlete.Athlete;
import com.aman.solid.isp.athlete.Jumpers;

/**
 * @author aman.verma
 *
 */

@Service
public class JumpersService implements Athlete, Jumpers {

	@Override
	public String longJump() {
		return "in long jump";
	}

	@Override
	public String highJump() {
		return "in high jump";
	}

	@Override
	public String compete() {
		return "started competing";
	}

}
