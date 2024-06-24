package com.ranjith.cool.app.Rest;

import com.common.Fortune;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController
{
    private Coach theCoach;
    private Fortune fortune;
@Value("${ENV}")
    public String env;

FunRestController (Coach coach,Fortune theFortune){
    theCoach=coach;
    fortune=theFortune;
}



    @GetMapping("/")
    public String sayHello(){
        return("Hello World"+env);
    }

    //expose new endpoint workout

    @GetMapping("/workout")
    public String workout(){
    return theCoach.dailyWorkout();
    }

    @GetMapping("/fortune")
    public String fortune(){
        return fortune.getFortune();
    }

    @GetMapping("/run")
    public String run(){
        return"Run a Hard 10k";
    }

    @GetMapping("/yes")
    public String yes(){
        return"Yes!!!!!!";
    }
    @GetMapping("/no")
    public String no(){
        return"no!!!!!!";
    }
}
