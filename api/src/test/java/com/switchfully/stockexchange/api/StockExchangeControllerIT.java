package com.switchfully.stockexchange.api;

import com.switchfully.stockexchange.domain.Stock;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestApplication.class})
public class StockExchangeControllerIT {

    @Autowired
    private StockExchangeController stockExchangeController;

    @Test
    public void test() {
        StockDto stockDto = stockExchangeController.getStock("TSLA");
        Assertions.assertThat(stockDto.getId()).isEqualTo("TSLA");
        Assertions.assertThat(stockDto.getName()).isEqualTo("Tesla");
    }
}