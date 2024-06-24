package com.ranjith.SpringCoreDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class RestController {

    private Coach theCoach;

    @Autowired
    RestController(Coach coach){
        theCoach=coach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Welcome WOrld";
    }
}
