package org.onepiece.controller;

import org.onepiece.domain.CurrencyConversion;
import org.onepiece.remote.ExchangeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {
    @Autowired
    private ExchangeClient exchangeClient;

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion currencyConversion(@PathVariable String from, @PathVariable String to,
        @PathVariable BigDecimal quantity
                                                 ) {
        CurrencyConversion currencyConversion = exchangeClient.getCurrencyExchange(from, to);
        return currencyConversion;
    }
}
