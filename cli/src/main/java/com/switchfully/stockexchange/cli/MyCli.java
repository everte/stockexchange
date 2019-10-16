package com.switchfully.stockexchange.cli;

import com.switchfully.domain.StockRepository;
import com.switchfully.stockexchange.api.StockExchangeController;

public class MyCli {
    public static void main(String[] args) {

        if (args.length == 1) {
            StockRepository stockRepository = new StockRepository();
            StockExchangeController stockExchangeController = new StockExchangeController();

            System.out.println(stockExchangeController.getStock(args[0]));
        }
    }
}
