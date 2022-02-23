package com.springdemoannotation;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "do golf every day";
	}

}
