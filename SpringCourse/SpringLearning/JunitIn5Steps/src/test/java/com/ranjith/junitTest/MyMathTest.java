package com.ranjith.junitTest;

import com.ranjith.junit.MyMath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyMathTest {
    MyMath math= new MyMath();

    @Test
    public void test(){
        int expected=5;
        assertEquals(expected, math.CalculateSum(new int[]{1,2,3}));

    }
    @Test
    public void test2(){
        int expected=0;
        assertEquals(expected, math.CalculateSum(new int[]{}));
    }
}
