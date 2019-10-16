package com.switchfully.domain;

import com.google.common.collect.ImmutableMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StockRepository {

    private static ImmutableMap<String, Stock> db;

    public StockRepository() {
        db = ImmutableMap.<String, Stock>builder()
            .put("AA", new Stock("AA", "Ambro AN"))
            .put("TSLA", new Stock("TSLA", "Tesla"))
            .put("APL", new Stock("APL", "Apple"))
            .put("GOOG", new Stock("GOOG", "Alphabet inc"))
            .build();
    }

    public static Stock getStockInformation(String stockId) {
        return db.get(stockId);
    }
}