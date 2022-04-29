package com.zemoso.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

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
