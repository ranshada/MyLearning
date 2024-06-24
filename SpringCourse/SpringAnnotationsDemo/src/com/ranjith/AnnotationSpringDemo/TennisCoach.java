package com.ranjith.AnnotationSpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
//@Autowired
//	public void doSomeCrazy(FortuneService theFortuneService) {
//		
//		System.out.println("Crazy stuff");
//		fortuneService=theFortuneService;
//	}
	
	// define a default constructor
//	@Autowired
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
		//fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	//defi

}
