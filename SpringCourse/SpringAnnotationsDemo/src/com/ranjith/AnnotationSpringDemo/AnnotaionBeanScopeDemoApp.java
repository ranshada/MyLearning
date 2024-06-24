package com.ranjith.AnnotationSpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionBeanScopeDemoApp {
	
	public static void main(String[] args) {
		
	
//load spring file
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	//retrieve bean
	Coach theCoach=context.getBean("tennisCoach",Coach.class);
	Coach theCoach1=context.getBean("tennisCoach",Coach.class);

	//call  methods
	boolean results= (theCoach==theCoach1);
	
	System.out.println("is pointing to same reference"+results);
	System.out.println("first reference"+theCoach);
	System.out.println("second reference"+theCoach1);

	
	
}

}