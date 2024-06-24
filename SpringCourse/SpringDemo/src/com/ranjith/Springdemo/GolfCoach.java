package com.ranjith.Springdemo;

public class GolfCoach implements Coach {
	private FortuneService fortuneservice;

	public GolfCoach(FortuneService theFortuneService) {
		fortuneservice = theFortuneService;
	}

	public String getDailyWorkout() {
		return "Practice your putting skills for 2 hours today";

	}

	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}
	
	//add an init method
	
	public void doMyStart() {
		System.out.println("Do my start up");
	}
	
	//add destroy method

	public void doDestroy() {
		System.out.println("Do my clean up");
	}
	}

