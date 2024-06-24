package com.ranjith.Springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
	
	private String[] data= {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The Journey is reward"};
	
	private Random myRandom= new Random();
	
	public String getFortune() {
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}
	
	}


