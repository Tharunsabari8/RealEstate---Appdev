package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo"})
public class AppdevelopmentApplication {

    // Defining a bean for ModelMapper to use it throughout the application for mapping objects
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper(); // Returning a new instance of ModelMapper
    }

    public static void main(String[] args) {
        SpringApplication.run(AppdevelopmentApplication.class, args); // Running the Spring Boot application
    }
}
