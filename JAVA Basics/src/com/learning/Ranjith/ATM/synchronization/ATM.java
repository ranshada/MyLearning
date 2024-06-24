package com.learning.Ranjith.ATM.synchronization;

public class ATM {
	
	synchronized void checkBalance(String name) {
		System.out.println("Checking "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Balance");
	}
	
	synchronized void withdraw(String name, int amount) {
		System.out.println(name+"  has withdrawing following amount  ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Amount is "+ amount);
	}

}
