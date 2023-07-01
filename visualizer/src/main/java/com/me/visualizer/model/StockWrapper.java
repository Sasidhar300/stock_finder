package com.me.visualizer.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;
import yahoofinance.Stock;

@Getter
@With
@AllArgsConstructor
@Document(collection = "stocks")
public class StockWrapper {
    @Id
    private String id;

    private final Stock stock;
    private final LocalDateTime accessTime;
    private BigDecimal currentPrice;
    private String exchange;
   

    public StockWrapper(final Stock stock, final BigDecimal currentPrice, String exchage) {
        this.stock = stock;
        this.accessTime = LocalDateTime.now();
        this.currentPrice = currentPrice;
        this.exchange = exchage;
    }

}
