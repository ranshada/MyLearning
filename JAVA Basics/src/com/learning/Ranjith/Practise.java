package com.learning.Ranjith;

import java.util.Scanner;

public class Practise {
	
	public int reverse(int i) {
		int temp=0;
		while(i!=0) {
			int digit=i%10;
			temp=temp*10+digit;
			i=i/10;			
		}
		
		
		
		return temp;
	}
	
	public void sum(int ...x) {
		for(int a:x)
		System.out.println(a);
	}
	
public static void main(String[] args) {
	//Practise p=new Practise();
	//System.out.println(p.reverse(4321));
	//p.sum(1,2,3,4);
	//int a[]= {90,3,9,7,8,12,6,15,5,4,10,8};
	//*******Searching for a key
//	Scanner s= new Scanner(System.in);
//	System.out.println("Enter element to search");
//	int search=s.nextInt();
//	for(int x: a) {
//		if(x==search) {
//			System.out.println("Element found");
//			System.exit(x);
//		}
//	}
//	System.out.println("Not found");
	//System.out.println("Sum is   "+sum);
	//******FInding max
//	int max=a[0];
//	for(int i=0;i<a.length;i++) {
//		
//		if(a[i]>max) {
//			max=a[i];
//		}
//		
//	}
//	System.out.println("Maximum value is "+max);
	
	//*****second largest element
//	int max1=a[0];
//	int max2=a[0];
//	for(int i=0;i<a.length;i++) {
//		if(a[i]>max1) {
//			max2=max1;
//			max1=a[i];
//			
//		}
//		else if(a[i]>max2){
//			max2=a[i];
//		}
//	}
//	System.out.println("First Largest is "+max1);
//	System.out.println("Second Largest is "+max2);

		

//*************left rotation of array
	//int temp=a[a.length-1];
//	for(int i =1;i<a.length;i++) {
//		
//		a[i-1]=a[i];
//		
//	
//		
//	}
//	a[a.length-1]=temp;
//	
//	System.out.println("Rotated array"+a.length);
//	for(int x:a) {
//		System.out.println(x);
//	}
	//***right rotation
	
//	for(int i=a.length-2;i>=0;i--) {
//		a[i+1]=a[i];
//	}
//	a[0]=temp;
//for(int x:a) {
//	System.out.print(x+",");
	
//}
	
	//******* inserting an element and deleting
	
//	int index=2;
//	//int ele=34;
//	
//	int[] b=new int[6];
//	b[0]=1;
//	b[1]=2;	
//	b[2]=3;
//	b[3]=4;
//	b[4]=5;
//	b[5]=6;
//	for(int x:b) {
//		System.out.print(x+",");
//	}
//	System.out.println();
////	for(int i=5;i>=index;i--) {
////		b[i+1]=b[i];
////	}
//	for(int i=6;i>index;i--) {
//		a[i]=a[i-1];
//	}
//	b[index]=ele;
//	for(int x:b) {
//		System.out.print(x+",");
//	}
	
//	for(int i=index;i<b.length-1;i++) {
//		b[i]=b[i+1];
//	}
//	System.out.println();
//	for(int x:b) {
//	System.out.print(x+",");
	
	
//	for(int x:b) {
//		System.out.print(x+","+a+b);
//	
//	}
	
	
	String s="Java";
	s=s.toLowerCase();
	System.out.println(s);
	
	
	
	
	
	
}
	
	
}


