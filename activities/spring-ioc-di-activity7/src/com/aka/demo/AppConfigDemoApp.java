package com.aka.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigDemoApp {

	public static void main(String[] args) {
		
		// Load the java config
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		// retrieve the coach
		Coach coach = context.getBean("baseballCoach", Coach.class);
		
		// call the method
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		// close the resource/context/container
		context.close();

	}

}

