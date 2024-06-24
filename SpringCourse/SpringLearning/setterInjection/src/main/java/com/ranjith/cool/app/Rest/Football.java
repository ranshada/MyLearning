package com.ranjith.cool.app.Rest;

import org.springframework.stereotype.Component;

@Component
public class Football implements Coach{
    Football(){
        System.out.println("In Football");
    }
    @Override
    public String dailyWorkout() {
        return "Practise Goal for 10 times";
    }
}
