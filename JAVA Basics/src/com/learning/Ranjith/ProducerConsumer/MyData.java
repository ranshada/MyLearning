package com.learning.Ranjith.ProducerConsumer;

public class MyData {

	int a;
	boolean flag = true;

	synchronized public void set(int s) {
		while (flag != true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		a = s;
		flag = false;
		notify();
	}

	synchronized public int getData() {
		while (flag != false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int x = a;
		flag = true;
		notify();
		return x;

	}

}
