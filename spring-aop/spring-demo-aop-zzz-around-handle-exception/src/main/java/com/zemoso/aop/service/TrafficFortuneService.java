package com.zemoso.aop.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {

    public String getFortune() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "Expect heavy traffic";
    }

    public String getFortune(boolean tripWire) {

        if(tripWire) {
            throw new RuntimeException(("Major Accident"));
        }

        return getFortune();
    }
}
