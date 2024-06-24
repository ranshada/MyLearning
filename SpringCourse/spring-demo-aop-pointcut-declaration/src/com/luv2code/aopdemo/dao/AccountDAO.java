package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount) {
		System.out.println(getClass()+"  : DOING MY WORK : ADDING AN ACCOUNT");
	}

	public void addUpdate() {
		System.out.println(getClass()+"  : DOING MY WORK : updating AN ACCOUNT");
	}
	
	public boolean doWork() {
		System.out.println(getClass()+":   doWork()");
		return false;
	}

	public void addAccount(Account myAccount, boolean b) {
System.out.println(getClass()+":   add account with boolean");		
	}
}
