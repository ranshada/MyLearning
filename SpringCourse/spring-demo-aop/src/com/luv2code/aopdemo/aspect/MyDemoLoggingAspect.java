package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all related advises for logging
	
	//lets start with an @before advise
	
	@Before("execution(*  add*(Account))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>>Executing @Before advice on addAccount()");
	}
}
