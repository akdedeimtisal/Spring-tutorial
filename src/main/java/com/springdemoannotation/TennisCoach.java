package com.springdemoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired //field injection
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;	
	
	/*
	@Autowired //constructor injection
	public TennisCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	
	// define a default constructor
	
	public TennisCoach() {
		System.out.println("inside the default constructor");
	}
	
	// define a setter method to injection
/*	@Autowired // setter injection
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		System.out.println("inside the setter method");
	}*/
	
/*	@Autowired //method injection
	public void doStuff(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		System.out.println("inside the normal method");
	}*/
	
	
	@Override
	public String getDailyWorkout() {
		return "Run daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
