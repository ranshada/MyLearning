package com.learning.Ranjith;

class ThreadNew1 extends Thread{

	public ThreadNew1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=1;
		
		while(true) {
			System.out.println(count++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}


public class ThreadNew {
	public static void main(String[] args) {
		ThreadNew1 t=new ThreadNew1("My thread 1");
		t.setDaemon(true);
		System.out.println("ID   "+t.getId());
		System.out.println("Name   "+t.getName());

		System.out.println("Priority   "+t.getPriority());
		t.start();
		Thread mainThread= Thread.currentThread();
		System.out.println(Thread.currentThread());
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//t.interrupt();
		System.out.println("State   "+t.getState());
		System.out.println("Alive   "+t.isAlive());
		System.out.println("Dumbstack  "+t.getStackTrace());

	}
}