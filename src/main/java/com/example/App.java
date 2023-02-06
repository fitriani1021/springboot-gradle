package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.model")
@SpringBootApplication(scanBasePackages = "com.example")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}