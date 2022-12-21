package com.example.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsDemoApplication {

    @GetMapping
    public String getMethod(){return "Welcome to the Boring World";}
    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);

    }

}
