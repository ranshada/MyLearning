package com.ranjith.junit;

public class MyMath {

    //{1,2,3,}==1+2+3
    public int CalculateSum(int[] numbers){
        int sum=0;
        for(int number: numbers){
             sum += number;

        }
        return sum;
    }
}
