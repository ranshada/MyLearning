package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LogToCloudAspect {
	@Before("com.luv2code.aopdemo.aspect.LovAOPExpressions.noGetterSetter()")
	public void logToCloud() {
		System.out.println("\n======>>log to cloud");
	}
}
