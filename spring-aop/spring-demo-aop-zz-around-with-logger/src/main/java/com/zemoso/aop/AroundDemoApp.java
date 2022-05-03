package com.zemoso.aop;

import com.zemoso.aop.dao.AccountDAO;
import com.zemoso.aop.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AroundDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        System.out.println("\nMain Program: AroundDemoApp");

        System.out.println("Calling getFortune");

        String data = theFortuneService.getFortune();

        System.out.println("\nMy Fortune is: " + data);

        System.out.println("Finished");

        // close the context
        context.close();
    }

}
