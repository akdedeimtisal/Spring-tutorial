package com.springdemoannotation;

import java.io.FileNotFoundException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) throws FileNotFoundException, Exception {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		//get the bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
	//	Coach golfCoach = context.getBean("golfCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
	//	System.out.println(golfCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
	
		
		//close the context
		context.close();
	}

}
