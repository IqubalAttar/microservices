package com.iq.microservices.currencyexchangeservice.controller;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){

        ExchangeValue echangeValue = new ExchangeValue(1000, from, to, BigDecimal.valueOf(65));
        echangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return echangeValue;
    }
}
