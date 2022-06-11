package com.aka.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach secondCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == secondCoach);
		System.out.println("Result: " + result);
		System.out.println("The Couch: " + theCoach);
		System.out.println("Second Couch: " + secondCoach);
		context.close();
	}

}
