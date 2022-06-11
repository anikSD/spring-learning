package com.aka.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("The result: " + result);
		System.out.println("Memory Location of theCoach: " + theCoach);
		System.out.println("Memory Location of alphaCoach: " + alphaCoach);
		
		context.close();

	}

}
