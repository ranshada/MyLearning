package com.ranjith.cool.app.Rest;

import com.common.Fortune;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    private Coach theCoach;

    private Fortune fortune;
    @Value("${ENV}")
    public String env;

    @Autowired
    public void setCoach(
            @Qualifier("coachImpl") Coach coach) {
        theCoach = coach;
    }

    @Autowired
    public void setFortune(Fortune theFortune) {
        fortune = theFortune;
    }


    @GetMapping("/")
    public String sayHello() {
        return ("Hello World" + env);
    }

    //expose new endpoint workout

    @GetMapping("/workout")
    public String workout() {
        return theCoach.dailyWorkout();
    }

    @GetMapping("/fortune")
    public String fortune() {
        return fortune.getFortune();
    }

    @GetMapping("/run")
    public String run() {
        return "Run a Hard 10k";
    }

    @GetMapping("/yes")
    public String yes() {
        return "Yes!!!!!!";
    }

    @GetMapping("/no")
    public String no() {
        return "no!!!!!!";
    }

    @PostConstruct
    public void doSomething(){
        System.out.println("In Init method using Post COnstrct"+getClass().getSimpleName());

    }
    @PreDestroy
    public void docleanUp(){
        System.out.println("In destroy Methd yusing PreDestroy method");

    }
}
