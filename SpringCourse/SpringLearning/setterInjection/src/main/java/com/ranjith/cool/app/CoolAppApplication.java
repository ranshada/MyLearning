package com.ranjith.cool.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.common",
		"com.ranjith.cool.app"}
)
public class CoolAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolAppApplication.class, args);
	}

}
