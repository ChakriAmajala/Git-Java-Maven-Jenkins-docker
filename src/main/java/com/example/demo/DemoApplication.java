package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "🚀 Successfully Deployed Java-Maven-Jenkins-Docker Project!";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a Spring Boot app built with Maven, Dockerized, and deployed via Jenkins CI/CD pipeline.";
    }
}

