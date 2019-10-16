package com.switchfully.domain;

public enum StockCurrency {
    EUR("Euro", "E"),
    USD("Dollar", "$"),
    GBP("Pound", "#");

    private final String label;
    private final String symbol;

    StockCurrency(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }

    public String getLabel() {
        return label;
    }

    public String getSymbol() {
        return symbol;
    }
}
