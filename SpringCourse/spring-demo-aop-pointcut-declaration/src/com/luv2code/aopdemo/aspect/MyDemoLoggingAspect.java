package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all related advises for logging
	
	@Pointcut("execution(*  com.luv2code.aopdemo.dao.*.*(..))")
	private void forDAOPackage() {}
	
	
	//lets start with an @before advise
	
	@Before("forDAOPackage()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n======>>>Executing @Before advice on addAccount()");
		
		//display the method signature
		
		MethodSignature methSig=(MethodSignature) theJoinPoint.getSignature();
		
		System.out.println("Method : "+methSig);
		//display method arguments
		
		
		
	}
}
