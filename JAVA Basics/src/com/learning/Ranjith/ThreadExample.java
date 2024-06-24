package com.learning.Ranjith;

public class ThreadExample extends Thread{
	
	public void run() {
		int i=1;
		while(true) {
			System.out.println("Hello"+ i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		ThreadExample t=new ThreadExample();
		t.start();
		int i=1;
		while(true) {
			System.out.println("World"+ i);
			i++;
		}
	}

}
