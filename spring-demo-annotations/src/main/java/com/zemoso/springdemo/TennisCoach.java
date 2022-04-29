package com.zemoso.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements  Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*
    // constructor injection autowired
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    */

    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }

    //add an init method
    //@PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    //add a destroy method
    //@PreDestroy
    public void doMyStartupStuffDestroy() {
        System.out.println("TrackCoach: inside method doMyStartupStuffDestroy");
    }

    /*
    // setter injection autowired
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }
    */

    /*
    // injecting through anymethod
    @Autowired
    public void anyMethod(FortuneService fortuneService) {
        System.out.println("TennisCoach: inside anyMethod() method");
        this.fortuneService = fortuneService;
    }
     */

    @Override
    public String getDailyWorkout() {
        return "Practice your banckhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
