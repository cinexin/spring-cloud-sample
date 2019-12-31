package org.cinexin.currency.exchange.domain

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class ExchangeValue(
        @Id
        var id: Long,

        @Column(name="currency_from")
        var from: String,

        @Column(name="currency_to")
        var to: String,

        var conversionMultiple: BigDecimal,

        var port: Int = 8000
) {
    constructor(): this(0L, "USD", "EUR", BigDecimal(1.2), 8000)
}