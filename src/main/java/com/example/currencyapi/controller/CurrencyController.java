package com.example.currencyapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.currencyapi.service.CurrencyService;


@RestController
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/api/convert") 
    public double convert(@RequestParam String from, @RequestParam String to, @RequestParam double amount) {
        return currencyService.convert(from, to, amount);
    }
}