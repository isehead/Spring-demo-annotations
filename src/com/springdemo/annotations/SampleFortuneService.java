package com.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class SampleFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return ("Lucky day!");
    }
}
