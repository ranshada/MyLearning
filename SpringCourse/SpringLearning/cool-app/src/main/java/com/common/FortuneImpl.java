package com.common;

import org.springframework.stereotype.Component;

@Component
public class FortuneImpl implements Fortune{
    @Override
    public String getFortune() {
        return "You are very Lucky!!!!!";
    }
}
