package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	// this is where we add all related advises for logging
	
	
	
	@Before("com.luv2code.aopdemo.aspect.LovAOPExpressions.noGetterSetter()" )
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n======>>>Executing @Before advice on addAccount()");
		
		//display the method signature
		
		MethodSignature methSig=(MethodSignature) theJoinPoint.getSignature();
		
		System.out.println("Method : "+methSig);
		//display method arguments
		
		Object[] args=theJoinPoint.getArgs();
		for (Object tempArg:args) {
			// downcast and print account specific stuff
			if(tempArg instanceof Account) {
				System.out.println("Object  :"+tempArg);
				Account theAccount=(Account) tempArg;
				System.out.println("Account name :"+theAccount.getName());
				System.out.println("Account level :"+theAccount.getLevel());

			}
		}
	}
		
		
		
		
	
}
