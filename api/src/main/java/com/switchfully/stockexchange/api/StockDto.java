package com.switchfully.stockexchange.api;

import com.switchfully.domain.Stock;
import com.switchfully.domain.StockPrice;

public class StockDto {

        private String id;
        private String name;
        private StockPrice price;

    public StockDto(Stock stock) {
        this.id = stock.getId();
        this.name = stock.getName();
        this.price = stock.getPrice();
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price.getPrice() + price.getCurrency().getSymbol() +
                '}';
    }
}

