package org.cinexin.currency.conversion.feignclients

import org.cinexin.currency.conversion.feignclients.domain.ExchangeValue
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

/**
 * name = "spring.application.name" in "application.properties" of destination service
 */
@FeignClient(name="currency-exchange-service", url = "http://localhost:8000")
interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    fun retrieveExchangeValue(@PathVariable("from") from: String,
                              @PathVariable("to") to: String): ExchangeValue?
}