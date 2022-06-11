package com.aka.demo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	private String[] fortunes = {"Great Luck! Dude", "Opps! Better luck next time", "You got a moderate one"};
	@Override
	public String getFortune() {
		Random random = new Random();
		return this.fortunes[random.nextInt(3)];
	}

}
