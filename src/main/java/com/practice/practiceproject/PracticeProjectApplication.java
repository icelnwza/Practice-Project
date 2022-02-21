package com.practice.practiceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class PracticeProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeProjectApplication.class, args);
    }

}
