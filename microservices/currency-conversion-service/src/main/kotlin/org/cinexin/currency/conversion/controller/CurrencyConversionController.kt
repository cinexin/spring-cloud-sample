package org.cinexin.currency.conversion.controller

import org.cinexin.currency.conversion.domain.CurrencyConversionBean
import org.cinexin.currency.conversion.domain.CurrencyConversionServiceImplementation
import org.cinexin.currency.conversion.service.CurrencyConversionServiceSelector
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("/currency-converter")
class CurrencyConversionController(private val currencyConversionServiceSelector: CurrencyConversionServiceSelector) {

    private val implementation = CurrencyConversionServiceImplementation.OPEN_FEIGN
    private val currencyConversionService = currencyConversionServiceSelector.forImplementation(implementation)

    @GetMapping("/from/{from}/to/{to}/quantity/{quantity}")
    fun convertCurrency(@PathVariable("from") from: String,
                        @PathVariable("to") to: String,
                        @PathVariable("quantity") quantity: BigDecimal): CurrencyConversionBean {
        return currencyConversionService.convert(from, to, quantity)
    }
}