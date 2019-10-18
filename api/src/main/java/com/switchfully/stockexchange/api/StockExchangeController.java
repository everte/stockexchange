package com.switchfully.stockexchange.api;
import com.switchfully.stockexchange.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RequestMapping("/stocks")
@ResponseBody
public class StockExchangeController {

    private StockService stockService;

    @Autowired
    public StockExchangeController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/{stockId}")
    public StockDto getStock(@PathVariable String stockId) {
        return new StockDto(stockService.getStock(stockId));
    }
}
