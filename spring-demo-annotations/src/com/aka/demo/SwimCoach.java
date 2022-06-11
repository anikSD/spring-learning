package com.aka.demo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author akuyaku
 *
 */
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${aka.email}")
	private String email;
	@Value("${aka.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters for warm up!";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	
	
	
}
