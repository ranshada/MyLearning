package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LovAOPExpressions {
	@Pointcut("execution(*  com.luv2code.aopdemo.dao.*.*(..))")
	public void forDAOPackage() {}
	
	@Pointcut("execution(*  com.luv2code.aopdemo.dao.*.get*(..))")
	public void getter() {}
	//lets start with an @before advise
	
	@Pointcut("execution(*  com.luv2code.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forDAOPackage() && !(getter() || setter())")
	public void noGetterSetter() {}
}
