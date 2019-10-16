package com.switchfully.stockexchange.service;

import com.switchfully.domain.Stock;
import com.switchfully.domain.StockCurrency;
import com.switchfully.domain.StockPrice;
import com.switchfully.domain.StockRepository;
import com.switchfully.stockexchange.ExternalStockInformationService;
import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;

public class StockService implements ExternalStockInformationService {

    public Stock getStock(String stockId) {
        Stock stock = StockRepository.getStockInformation(stockId);
        stock.setPrice(new StockPrice(getPriceInEuroForStock(stockId), StockCurrency.EUR));

        return stock;
    }

    @Override
    public BigDecimal getPriceInEuroForStock(String stockId) {
        return BigDecimal.valueOf(RandomUtils.nextDouble(10,100));
    }

}
