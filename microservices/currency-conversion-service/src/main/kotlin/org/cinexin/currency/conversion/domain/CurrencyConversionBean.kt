package org.cinexin.currency.conversion.domain

import java.math.BigDecimal

data class CurrencyConversionBean(
        val id: Long,
        val from: String,
        val to: String,
        val conversionMultiple: BigDecimal,
        val quantity: BigDecimal,
        val totalCalculatedAmount: BigDecimal,
        val port: Int
) {
    constructor(): this(0L,
            "USD",
            "EUR",
            BigDecimal.valueOf(1),
            BigDecimal.ZERO,
            BigDecimal.ZERO,
            0)
}