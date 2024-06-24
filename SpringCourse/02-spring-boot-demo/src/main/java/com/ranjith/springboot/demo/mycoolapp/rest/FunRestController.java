package com.ranjith.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
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
