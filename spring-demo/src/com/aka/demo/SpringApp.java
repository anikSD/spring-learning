package com.aka.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		// load the xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve the bean from the xml
		// The first parameter is the id of the bean that you want to retrieve and the second one is the class type of the 
		// interface or class you want to cast the object to.
		// If you do not pass any class type then you have to cast the object yourself. Which might lead to ClassCastException
		Coach coach = context.getBean("myCricketCoach", Coach.class);
		// load the function you need from the acquired bean object
		System.out.println(coach.getDailyWorkout());
		
		// call the injected service feature
		System.out.println(coach.getDailyFortune());
		// close the context
		context.close();
	}

}
