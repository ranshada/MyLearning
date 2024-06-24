package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public boolean addSillyMember() {
		System.out.println(getClass()+"  : doing something on membership");
		return true;
	}
	
	public void goToSleep() {
		System.out.println(getClass()+": I am going to sleep now");
	}

}
