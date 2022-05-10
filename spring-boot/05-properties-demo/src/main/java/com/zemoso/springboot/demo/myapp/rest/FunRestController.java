package com.zemoso.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // inject properties for coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return coachName + " " + teamName;
    }

    @GetMapping("/")
    public String hello()
    {
        return "Hello World!!";
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return "Run a hard 5k";
    }
}
