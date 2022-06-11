package com.aka.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public FortuneService injectFortuneService() {
		return new YourFortuneService();
	}
	
	@Bean
	public Coach baseballCoach() {
		return new BaseballCoach(injectFortuneService());
	}
	
}
