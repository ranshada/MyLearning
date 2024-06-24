package com.learning.Ranjith;

public class ThreadInmplements implements Runnable{

	@Override
	public void run() {
		int i=1;
		while(true) {
			System.out.println("Hello"+ i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		ThreadInmplements t=new ThreadInmplements();
		Thread t1 = new Thread(t);
		t1.start();
		int i=1;
		while(true) {
			System.out.println("World"+ i);
			i++;
		}
	}
	

}
