package com.learning.Ranjith.ProducerConsumer;

public class Producer extends Thread{
	
	MyData d;
	
	Producer(MyData d){
		this.d=d;
	}

	public void write() {
		int count=1;
		while (true) {
			
			System.out.println("Writing Data"+count);
			d.set(count++);
		}
	}
	
	public void run() {
		write();
	}
}
