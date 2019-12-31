package org.cinexin.currency.exchange.domain

import java.math.BigDecimal

data class ExchangeValue(
        var id: Long,
        var from: String,
        var to: String,
        var conversionMultiple: BigDecimal,
        var port: Int
) {
    constructor(): this(0L, "USD", "EUR", BigDecimal(1.2), 8000)
}