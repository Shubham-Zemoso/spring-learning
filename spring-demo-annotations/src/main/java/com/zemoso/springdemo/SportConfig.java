package com.zemoso.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.zemoso.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService SadFortuneService() {
        return new SadFortuneService();
    }
    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        SwimCoach mySwimCoach = new SwimCoach( SadFortuneService() );
        return mySwimCoach;
    }
}
