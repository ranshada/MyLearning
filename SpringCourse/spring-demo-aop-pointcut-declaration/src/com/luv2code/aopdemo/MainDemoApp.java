package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		MembershipDAO thememDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// call business methid
		// theAccountDAO.addAccount();
		System.out.println("lets call it again");

		// theAccountDAO.addAccount();

		Account myAccount = new Account();

		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();
		
		
		thememDAO.addSillyMember();
		thememDAO.goToSleep();

		// close context

		context.close();
	}

}
