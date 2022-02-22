package com.springIoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscopeapplicationContext.xml");
		
		
		//retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object " + result );
		System.out.println("Memory location for theCoach" + theCoach);
		System.out.println("Memory location for alphaCoach" + alphaCoach);
		
	
		//close the context
		context.close();
		
		
		//output - singleton
	/*	Pointing to the same object true
		Memory location for theCoachcom.springIoC.TrackCoach@5ace1ed4
		Memory location for alphaCoachcom.springIoC.TrackCoach@5ace1ed4*/
		
		//output - prototype
		
	/*	Pointing to the same object false
		Memory location for theCoachcom.springIoC.TrackCoach@120f102b
		Memory location for alphaCoachcom.springIoC.TrackCoach@625732*/
		
	}		
}