package com.me.visualizer.service;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import com.me.visualizer.model.StockWrapper;
import lombok.AllArgsConstructor;
import yahoofinance.YahooFinance;
import yahoofinance.Stock;

@AllArgsConstructor
@Service
public class StockService {
    public StockWrapper findStock(String ticker) {

        try {
            Stock stock = YahooFinance.get(ticker);
            return new StockWrapper(stock, findPrice(stock), findExchange(stock));
        }

        catch (IOException e) {
            System.out.println("error");
        }

        return null;
    }

    private BigDecimal findPrice(final Stock stock) throws IOException {

        return stock.getQuote(true).getPrice();

    }

    private String findExchange (final Stock stock) throws IOException {

        return stock.getStockExchange();

    }
}
