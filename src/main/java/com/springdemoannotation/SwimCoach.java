package com.springdemoannotation;

import java.io.FileNotFoundException;


public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters";
	}

	@Override
	public String getDailyFortune() throws FileNotFoundException, Exception {
		return fortuneService.getFortuneService();
	}
	

}
