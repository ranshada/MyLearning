package com.ranjith.AnnotationSpringDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServicec implements FortuneService {

	@Override
	public String getFortune() {
		return "you are lucky";
	}

}
