package com.zemoso.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

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
