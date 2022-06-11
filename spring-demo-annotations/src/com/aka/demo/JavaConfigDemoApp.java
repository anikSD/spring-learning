package com.aka.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//retrieve the config file
		// Will not work right now as the component scan is turned off on the SportConfig class
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		// call a method from the bean
		System.out.println(theCoach.getDailyWorkout());
		// Get the daily fortune
		System.out.println(theCoach.getDailyFortune());		
		// close the container
		context.close();
	}

}
