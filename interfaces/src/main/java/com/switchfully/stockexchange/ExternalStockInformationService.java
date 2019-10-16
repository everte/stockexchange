package com.switchfully.stockexchange;

import java.math.BigDecimal;

public interface ExternalStockInformationService {
    BigDecimal getPriceInEuroForStock(String stockId);
}