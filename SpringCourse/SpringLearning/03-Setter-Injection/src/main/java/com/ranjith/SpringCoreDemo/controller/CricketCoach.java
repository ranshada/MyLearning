package com.ranjith.SpringCoreDemo.controller;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling 15 mins today !!!";
    }
}
