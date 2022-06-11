package com.aka.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach crikcetCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(crikcetCoach.getDailyWorkout());
		System.out.println(crikcetCoach.getDailyFortune());
		System.out.println(crikcetCoach.getEmailAddress());
		System.out.println(crikcetCoach.getTeam());
		
		context.close();
	}

}
