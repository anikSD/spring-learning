package com.aka.demo;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Good Luck!",
			"Opps!",
			"Great"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
