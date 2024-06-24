package com.ranjith.AnnotationSpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.ranjith.AnnotationSpringDemo")
@PropertySource("classpath:fortune.properties")
public class SportConfig {
	// define a method to expose a bean
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	//define a bean to swim coach and inject dependencies

	
}
