package com.example.currencyapi.service;
import com.example.currencyapi.client.ExchangeRateClient;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    private final ExchangeRateClient exchangeRateClient;

    public CurrencyService(ExchangeRateClient exchangeRateClient) {
        this.exchangeRateClient = exchangeRateClient;
    }

    public double convert(String from, String to, double amount) {
        return exchangeRateClient.getRate(from, to) * amount;
    }
}