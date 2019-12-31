package org.cinexin.currency.exchange.service.impl

import org.cinexin.currency.exchange.domain.ExchangeValue
import org.cinexin.currency.exchange.service.ExchangeValueService
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class ExchangeValueServiceImpl: ExchangeValueService {

    override fun retrieveExchangeValue(from: String, to: String): ExchangeValue {
        return ExchangeValue(1000L, from, to, BigDecimal.valueOf(65))
    }
}