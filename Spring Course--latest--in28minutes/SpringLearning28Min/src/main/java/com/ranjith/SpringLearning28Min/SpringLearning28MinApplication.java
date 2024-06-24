package com.ranjith.SpringLearning28Min;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearning28MinApplication {

	public static void main(String[] args) {
		BinerySearchImpl bs= new BinerySearchImpl();
		
		int result=bs.binarySearch(new int[] {12,3,4,}, 3);
		System.out.println(result);
		
		SpringApplication.run(SpringLearning28MinApplication.class, args);
	}

}
