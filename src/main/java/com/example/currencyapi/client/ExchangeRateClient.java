package com.example.currencyapi.client;

import org.springframework.stereotype.Component;

@Component 
public class ExchangeRateClient {
    public double getRate(String from, String to) {
        return 1.0;
    }
}