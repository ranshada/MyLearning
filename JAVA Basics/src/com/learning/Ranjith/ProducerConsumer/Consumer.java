package com.learning.Ranjith.ProducerConsumer;

public class Consumer extends Thread{
	
	MyData d;
	
	Consumer(MyData d){
		this.d=d;
	}

	public void read() {
		while (true) {
			System.out.println("Reading Data"+d.getData());
		}
	}
	
	public void run() {
		read();
	}
}
