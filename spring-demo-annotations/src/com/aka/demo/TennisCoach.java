package com.aka.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// This will register the bean to the config file with the annotation
// All we need to do is to use the bean id
// If we don't explicitly specify the bean id, the default bean id will be used.
// That is the camel case version of the bean class
// Here in this example will be TennisCoach -> tennisCoach

// We can also provide the bean id of our own
// like @Component("theBeanID")
@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	// Field injection auto wiring
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// No-args constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside constructor");
	}
	
	// initialized bean life-cycle method
	@PostConstruct
	public void initBean() {
		System.out.println(">> TennisCoach: Bean initialized");
	}
	
	// destroy bean life-cycle method (must be a singleton scope bean)
	@PreDestroy
	public void destroyBean() {
		System.out.println(">> TennisCoach: Bean destroyed");
	}
	
	// The following is automatically injecting the fortune service to the TennisCoach constructor
	// When creating the bean object. Because of the Autowired annotation
	// Note:- From Spring 4.3 the Autowired to the constructor is no longer required, it will automatically wired the service.
	// Until unless we define more than one constructor, then we need to tell the spring container to use a certain constructor.
	// But it is a good practice to use this annotation for readability purpose.
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	// Using the setter method to inject the service
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		
		return "TennisCoach: Practice your backhand.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
