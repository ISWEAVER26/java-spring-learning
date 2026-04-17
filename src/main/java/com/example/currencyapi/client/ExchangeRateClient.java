package com.example.currencyapi.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.Map;

@Component 
public class ExchangeRateClient {

    private final WebClient webClient;

    public ExchangeRateClient(WebClient webClient) {
        this.webClient = webClient; 
    }


    public double getRate(String from, String to) {
        Map <String, Object> response = webClient.get( )
                            .uri("https://v6.exchangerate-api.com/v6/API_KEY/latest/{from}", from)
                            .retrieve()
                            .bodyToMono(Map.class)
                            .block();

        Map <String, Double> conversionRates = (Map <String, Double>) response.get("conversion_rates");
        return conversionRates.get(to);
    }   
}
