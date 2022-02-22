package com.springIoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class golfMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Golf golfCoach = context.getBean("myGolf", Golf.class);
		
		System.out.println(golfCoach.getDailyWorkout());
		System.out.println(golfCoach.getDailyFortune());
		
		System.out.println(golfCoach.getGolfClothes());
		
		context.close();
		
	}

}
