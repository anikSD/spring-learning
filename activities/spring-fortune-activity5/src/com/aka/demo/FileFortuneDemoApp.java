package com.aka.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileFortuneDemoApp {

	public static void main(String[] args) {
		
		// Load the xml config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// call the method
		System.out.println(coach.getDailyWorkout());
		// call the fotune
		System.out.println(coach.getDailyFortune());
		// close the context
		context.close();
	}
	
}
