package org.cinexin.currency.conversion.feignclients.domain

import java.math.BigDecimal

data class ExchangeValue(
        var id: Long,

        var from: String,

        var to: String,

        var conversionMultiple: BigDecimal,

        var port: Int
) {
    constructor(): this(0L, "currency-from", "currency-to", BigDecimal.ONE, 0)
}