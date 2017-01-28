package com.spring.project1;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	
	private String[] service = new String[]{"Assisting in training","Assisting in Scouting","Assisting in match analysis"};
	
	Random random = new Random();
		
	@Override
	public String getFortune() {
		
		return service[random.nextInt(service.length)];
	}

}
