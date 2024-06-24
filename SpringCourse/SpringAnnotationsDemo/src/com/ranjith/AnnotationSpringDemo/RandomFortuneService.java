package com.ranjith.AnnotationSpringDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data= {
			"Array 1",
			"Array 2",
			"Array 3"};
	private Random myRandom=new Random();
	
	
	@Override
	public String getFortune() {
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		//pick random out that array
		return theFortune;
	}

	
}
