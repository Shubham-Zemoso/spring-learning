package com.zemoso.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        // check the prototype bean scope

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        // call new swim coach methods ... has the props values injected
        System.out.println("email: " + coach.getEmail());
        System.out.println("team: " + coach.getTeam());
        context.close();
    }
}
