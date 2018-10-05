package com.aman.solid.isp.service;

import org.springframework.stereotype.Service;

import com.aman.solid.isp.athlete.Athlete;
import com.aman.solid.isp.athlete.Racers;

/**
 * @author aman.verma
 *
 */

@Service
public class RacersService implements Athlete, Racers {

	@Override
	public String relayRace() {
		return "in relay racing.";
	}

	@Override
	public String sprint() {
		return "in sprint.";
	}

	@Override
	public String fourHunderedMeters() {
		return "in 400 meters race.";
	}

	@Override
	public String eightHundredMeters() {
		return "in 800 meters race.";
	}

	@Override
	public String compete() {
		return "strated competing";
	}

}
