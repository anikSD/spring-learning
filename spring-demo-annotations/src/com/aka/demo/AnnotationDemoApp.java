package com.aka.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//retrieve the config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
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
