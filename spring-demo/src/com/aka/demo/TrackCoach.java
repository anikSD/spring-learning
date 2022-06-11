package com.aka.demo;

public class TrackCoach implements Coach {
	
	FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	// These are the life cycle method of the bean
	/**
	 * Rules:-
	 * 
	 */
	// This one will call when the bean is initiated
	public void beanInit() {
		System.out.println("Bean initiated. Calling the beanInit");
	}
	// This will be called when the bean is destroyed, i.e when the container is being closed
	public void beanDestroy() {
		System.out.println("Bean destroyed. Calling the beanDestroy");
	}
}
