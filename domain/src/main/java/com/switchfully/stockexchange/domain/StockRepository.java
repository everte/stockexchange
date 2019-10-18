package com.switchfully.stockexchange.domain;

import com.google.common.collect.ImmutableMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StockRepository {

    private  ImmutableMap<String, Stock> db;
    private static final Logger logger = LoggerFactory.getLogger(StockRepository.class);


    @Autowired
    public StockRepository() {
        db = ImmutableMap.<String, Stock>builder()
            .put("AA", new Stock("AA", "Ambro AN"))
            .put("TSLA", new Stock("TSLA", "Tesla"))
            .put("APL", new Stock("APL", "Apple"))
            .put("GOOG", new Stock("GOOG", "Alphabet inc"))
            .build();
    }

    public Stock getStockInformation(String stockId) {
        logger.debug("Requesting {} from repository/db", stockId);
        if (db.containsKey(stockId)) {
            return db.get(stockId);
        }
        return new Stock("","");
    }
}