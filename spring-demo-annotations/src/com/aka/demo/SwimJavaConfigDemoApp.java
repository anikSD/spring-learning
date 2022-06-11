package com.aka.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//retrieve the config file
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from the spring container
		// Note the get bean id -> same as the method name defined in the SportConfig class [Line->18]
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		// call a method from the bean
		System.out.println(theCoach.getDailyWorkout());
		// Get the daily fortune
		System.out.println(theCoach.getDailyFortune());	
		
		// Get the email and team from the SwimCoach function
		
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());
		
		// close the container
		context.close();
	}

}
