package com.aka.demo;

public class BasketCoach implements Coach{
	FortuneService fortuneService;
	public BasketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Do some passing practice.";
	}
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
