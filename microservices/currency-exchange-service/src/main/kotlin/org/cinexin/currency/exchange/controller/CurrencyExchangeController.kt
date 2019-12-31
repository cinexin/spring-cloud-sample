package org.cinexin.currency.exchange.controller

import org.cinexin.currency.exchange.domain.ExchangeValue
import org.cinexin.currency.exchange.service.ExchangeValueService
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/currency-exchange")
class CurrencyExchangeController(private val exchangeValueService: ExchangeValueService,
                                 private val environment: Environment) {

    @GetMapping("/from/{from}/to/{to}")
    fun retrieveExchangeValue(@PathVariable("from") from: String,
                              @PathVariable("to") to: String): ExchangeValue {
        @Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
        return exchangeValueService.retrieveExchangeValue(
                from,
                to,
                environment.getProperty("local.server.port").toInt()
        )
    }
}