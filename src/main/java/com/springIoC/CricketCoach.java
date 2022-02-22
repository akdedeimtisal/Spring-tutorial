package com.springIoC;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields
	private String email;
	private String team;
	
	
	//create no-arg constructor
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setEmail");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setTeam.");

		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg const.");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method.");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pratice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
