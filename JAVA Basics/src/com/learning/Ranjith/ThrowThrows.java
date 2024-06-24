package com.learning.Ranjith;

class NegativeDimensionException extends Exception{
	
	public String toString() {
		return "Negative Dimensions are not allowed";
	}
}

public class ThrowThrows {

static int area(int a, int b) throws Exception {
	if(a<0 || b<0)
		throw new NegativeDimensionException();
	return a*b;
}

static void meth1() throws Exception {
	System.out.println(area(-10,5));
}
	
	public static void main(String[] args) {
	
		try {
			meth1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		
		
	}
}
