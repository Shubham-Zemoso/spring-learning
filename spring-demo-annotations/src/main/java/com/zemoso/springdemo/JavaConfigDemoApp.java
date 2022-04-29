package com.zemoso.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach1 = context.getBean("tennisCoach", Coach.class);
        Coach coach2 = context.getBean("tennisCoach", Coach.class);

        // check the prototype bean scope

        System.out.println(coach1==coach2);
        System.out.println(coach1);
        System.out.println(coach2);

        System.out.println(coach1.getDailyWorkout());

        System.out.println(coach2.getDailyFortune());

        context.close();
    }
}
