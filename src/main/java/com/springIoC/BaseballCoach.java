package com.springIoC;

public class BaseballCoach implements Coach {
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {

		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
