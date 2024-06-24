package com.ranjith.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${coach.team}")
	private String teamName;
	
	//new endpoint team info to use variables
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach  :"+coachName+"  Team Name :"+teamName;
	}
	
	@GetMapping("/")
	public String home() {
		return "My Home page , Current time is    "+LocalDateTime.now();
	}

	//expose a new endpoint for workout
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k !";
	}
	
	@GetMapping("/fortune")
	public String getDailyfortune() {
		return "You are lucky day!";
	}
	
}
