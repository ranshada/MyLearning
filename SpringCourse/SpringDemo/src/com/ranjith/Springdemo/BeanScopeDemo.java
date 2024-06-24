package com.ranjith.Springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		//load the spring conf file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScopeAppContext.xml");
		Coach theCoach=context.getBean("myGolfCoach", Coach.class);
		Coach alphaCoach=context.getBean("myGolfCoach", Coach.class);

		//check if they are same
		
		boolean result=(alphaCoach==theCoach);
		System.out.println("Rsesults"+result);
		System.out.println("Memory Location : theCoach   :"+theCoach);
		System.out.println("Memory Location : theCoach   :"+alphaCoach);

		
		context.close();
		//retrieve bean from spring container
		
		
		
		

	}

}
