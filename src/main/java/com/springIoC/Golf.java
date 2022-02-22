package com.springIoC;

public class Golf implements Coach{
	
	private FortuneService fortuneService;
	private String golfClothes;
	
	public Golf() {
		System.out.println("Golf: inside no-arg const.");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Golf: inside setter method.");
		this.fortuneService = fortuneService;
	}

	public String getGolfClothes() {
		return golfClothes;
	}

	public void setGolfClothes(String golfClothes) {
		this.golfClothes = golfClothes;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do Golf every week";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "you are best in golf";
	}

}
