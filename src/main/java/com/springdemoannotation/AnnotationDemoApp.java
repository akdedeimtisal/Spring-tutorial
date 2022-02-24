package com.springdemoannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach golfCoach = context.getBean("golfCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
	//	System.out.println(golfCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
	
		
		//close the context
		context.close();
	}

}
