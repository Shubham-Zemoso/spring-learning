package com.zemoso.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout () {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it: " + fortuneService.getFortune();
    }

    //add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    //add a destroy method
    public void doMyStartupStuffDestroy() {
        System.out.println("TrackCoach: inside method doMyStartupStuffDestroy");
    }
}
