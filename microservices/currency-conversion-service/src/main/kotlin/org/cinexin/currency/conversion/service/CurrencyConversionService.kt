package org.cinexin.currency.conversion.service

import org.cinexin.currency.conversion.domain.CurrencyConversionBean
import java.math.BigDecimal

interface CurrencyConversionService {

    fun convert(from: String,
                to: String,
                quantity: BigDecimal): CurrencyConversionBean
}