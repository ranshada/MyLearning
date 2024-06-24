package com.learning.Ranjith.ATM.synchronization;

public class ATMApp {
	
	public static void main(String[] args) {
		ATM m = new ATM();
		Customer n=new Customer("Ranjith", m, 100);
		Customer n1=new Customer("Rachana", m, 1000);
n.start();
n1.start();
	}

}
