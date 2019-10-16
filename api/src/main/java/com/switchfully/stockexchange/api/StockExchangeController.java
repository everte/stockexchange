package com.switchfully.stockexchange.api;
import com.switchfully.domain.Stock;
import com.switchfully.stockexchange.service.*;


public class StockExchangeController {
    public StockDto getStock(String stockId) {
        StockService stockService = new StockService();
        Stock stock = stockService.getStock(stockId);
        StockDto stockDto = new StockDto(stock);
        return stockDto;
    }
}