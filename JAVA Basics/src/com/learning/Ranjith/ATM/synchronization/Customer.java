package com.learning.Ranjith.ATM.synchronization;

public class Customer extends Thread{

	ATM atm;
	String name;
	
	int amount;
	
	Customer(String n,ATM a, int amt){
		atm=a;
		name=n;
		amount=amt;
		
	}
	
	public void useAtm() {
		atm.checkBalance(name);
		atm.withdraw(name, amount);
	}
	@Override
	public void run() {
		useAtm();
	}
	
	
}
