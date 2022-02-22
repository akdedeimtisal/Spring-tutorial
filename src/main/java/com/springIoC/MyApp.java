package com.springIoC;

public class MyApp {

	public static void main(String[] args) {
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());		
		
		HappyFortuneService fortuneService = new HappyFortuneService();
		Coach baseballCoach = new BaseballCoach(fortuneService);
		System.out.println(baseballCoach.getDailyFortune());
		
	}

}
