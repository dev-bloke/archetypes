package com.meridal.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Application starter.
 */
@SpringBootApplication
public class Application {
	
    /**
     * Start Spring Boot.
     * @param args Spring arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}