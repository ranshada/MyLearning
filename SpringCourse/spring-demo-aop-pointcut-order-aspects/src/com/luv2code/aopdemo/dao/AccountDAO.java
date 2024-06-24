package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	
	public String getName() {
		System.out.println(getClass()+":   getName()");

		return name;
	}

	public void setName(String name) {
		System.out.println(getClass()+":   setname()");

		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass()+":   getServicecode()");

		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass()+":   setSericecode()");

		this.serviceCode = serviceCode;
	}

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
