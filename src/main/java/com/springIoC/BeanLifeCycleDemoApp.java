package com.springIoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	public static void main(String[] args) {
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		
		//retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		//close the context
		context.close();
	
		//Note: For "prototype" scoped beans, Spring does not call the destroy method.
	
		//output
	/*	TrackCoach: inside init method
		Run a hard 5k --> call the method
		TrackCoach: inside destroy method */

		

	}		
}