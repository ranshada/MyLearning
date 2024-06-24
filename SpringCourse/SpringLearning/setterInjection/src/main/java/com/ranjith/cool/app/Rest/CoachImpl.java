package com.ranjith.cool.app.Rest;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CoachImpl implements Coach{
    @PostConstruct
    public void doSomething2(){
        System.out.println("In Init method using Post COnstrct"+getClass().getSimpleName());

    }
    @PreDestroy
    public void docleanUp2(){
        System.out.println("In destroy Methd yusing PreDestroy method"+getClass().getSimpleName());

    }
    CoachImpl(){
        System.out.println("In CoachImpl");
    }
    @Override
    public String dailyWorkout() {
        return "Practise 5miles per hour";
    }


}
