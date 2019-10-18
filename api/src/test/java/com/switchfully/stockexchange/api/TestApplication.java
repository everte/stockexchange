package com.switchfully.stockexchange.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.switchfully.stockexchange"})
public class TestApplication {
    public static void main(String[] args) {

        SpringApplication.run(TestApplication.class, args);
    }
}

