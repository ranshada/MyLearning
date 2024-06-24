package com.ranjith.cool.app.Rest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Tennis implements Coach{
    Tennis(){
        System.out.println("In Tennis");
    }
    @Override
    public String dailyWorkout() {
        return "Practise Tennis for 23 hours daily";
    }
}
