package com.ranjith.cool.app.Rest;

import org.springframework.stereotype.Component;

@Component
public class CoachImpl implements Coach{

    @Override
    public String dailyWorkout() {
        return "Practise 5miles per hour";
    }


}
