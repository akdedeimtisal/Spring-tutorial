package com.springdemoannotation;

import java.io.FileNotFoundException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired //field injection
	@Qualifier("newFortune")
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
	
	// define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("inside startup");
	}
	
	
	// define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("inside cleanup");
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
	public String getDailyFortune() throws FileNotFoundException, Exception {
		return fortuneService.getFortuneService();
	}

}
