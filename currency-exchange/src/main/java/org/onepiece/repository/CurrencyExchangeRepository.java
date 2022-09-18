package org.onepiece.repository;

import org.onepiece.domain.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    public CurrencyExchange findByCurrencyFromAndCurrencyTo(String from, String to);
}
