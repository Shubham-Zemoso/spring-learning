package com.zemoso.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are same
        boolean result = (theCoach == alphaCoach);

        System.out.println(result);
        System.out.println(theCoach);
        System.out.println(alphaCoach);

        context.close();
    }
}
