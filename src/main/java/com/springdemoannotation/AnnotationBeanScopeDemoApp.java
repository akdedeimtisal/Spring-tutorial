package com.springdemoannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach); //when singleton (defuault) result is true and they show the same memory
		System.out.println("pointing the same object: " + result);
		System.out.println("Memory for theCoach: " + theCoach);
		System.out.println("Memory for alphaCoach:" + alphaCoach);
		
		 // when prototype scope result is false and they show different memory places.
		context.close();
	}

}
