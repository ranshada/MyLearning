package com.learning.Ranjith.inheritence;

public class InnerclassExample {

	int x=10;
	
	class Inner{
		int y=20;
		
		void display() {
			System.out.println(x+"  "+y);
		}
		
	}
	
	public void meth() {
		Inner i= new Inner();
System.out.println(i.y);
i.display();
//System.out.println(i.display());
		
	}
}
