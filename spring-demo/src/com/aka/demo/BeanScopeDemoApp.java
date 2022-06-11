package com.aka.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// Showing the life-cycle method call from the bean automatically
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life-cycle-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
