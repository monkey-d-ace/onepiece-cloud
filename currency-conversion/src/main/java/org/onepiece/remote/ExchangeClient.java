package org.onepiece.remote;

import org.onepiece.domain.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(value = "currency-exchange")
public interface ExchangeClient {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion getCurrencyExchange(
            @PathVariable String from,
            @PathVariable String to
    );
}
