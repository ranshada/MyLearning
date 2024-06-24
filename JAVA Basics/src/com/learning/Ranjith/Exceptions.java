package com.learning.Ranjith;

import java.io.FileInputStream;

class LowBalanceException extends Exception{
	public String toString() {
		return"Balance is low";
	}
}

public class Exceptions {
	
	static void fun1() {
		try {
		//FileInputStream fi=new FileInputStream("myText.txt");
		throw new  LowBalanceException();
		}
		catch(LowBalanceException e) {
			System.out.println(e);
		}
	}
	
	static void fun2() {
		fun1();
	}
	
	static void fun3()
	{
		fun2();
	}

	public static void main(String[] args) {
		
		fun3();
		
	}
//		int a, b, c;
//		a=10;
//		b=0;
//		
//		try {
//		c=a/b;
//		}
//		catch(ArithmeticException e){
//			System.out.println("Division by zero is not allowed"+e);
//			
//		}
//		
//		//System.out.println(c);
//		
//		System.out.println("End of program");
//	}
}
