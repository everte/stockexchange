package com.switchfully.stockexchange.service;

import com.switchfully.stockexchange.domain.Stock;
import com.switchfully.stockexchange.domain.StockCurrency;
import com.switchfully.stockexchange.domain.StockPrice;
import com.switchfully.stockexchange.domain.StockRepository;
import com.switchfully.stockexchange.ExternalStockInformationService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class StockService implements ExternalStockInformationService {

    private StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public Stock getStock(String stockId) {
        Stock stock = stockRepository.getStockInformation(stockId);
        stock.setPrice(new StockPrice(getPriceInEuroForStock(stockId), StockCurrency.EUR));

        return stock;
    }

    @Override
    public BigDecimal getPriceInEuroForStock(String stockId) {
        return BigDecimal.valueOf(RandomUtils.nextDouble(10,100));
    }

}
