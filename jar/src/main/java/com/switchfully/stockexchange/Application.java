package com.switchfully.stockexchange;

import com.switchfully.stockexchange.api.StockExchangeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        logger.debug("STARTING SPRING MAIN");
        SpringApplication.run(Application.class, args);
    }
}
