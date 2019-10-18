package com.switchfully.stockexchange.api;

import com.switchfully.stockexchange.domain.Stock;
import com.switchfully.stockexchange.domain.StockPrice;

import java.io.Serializable;

public class StockDto implements Serializable {

        private String id;
        private String name;
        private StockPrice price;

    public StockDto(Stock stock) {
        this.id = stock.getId();
        this.name = stock.getName();
        this.price = stock.getPrice();
    }

//    @Override
//    public String toString() {
//        return "Stock{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", price=" + price.getPrice() + price.getCurrency().getSymbol() +
//                '}';
//    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StockPrice getPrice() {
        return price;
    }
}

