package com.aka.demo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 100 swings!";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
