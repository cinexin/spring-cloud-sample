package org.cinexin.currency.exchange.service.impl

import org.cinexin.currency.exchange.domain.ExchangeValue
import org.cinexin.currency.exchange.repository.ExchangeValueRepository
import org.cinexin.currency.exchange.service.ExchangeValueService
import org.springframework.stereotype.Service

@Service
class ExchangeValueServiceImpl(private val exchangeValueRepo: ExchangeValueRepository): ExchangeValueService {

    override fun retrieveExchangeValue(from: String, to: String, port: Int): ExchangeValue? {
        return exchangeValueRepo.findByFromAndTo(from, to)?.let {
            exchangeValue -> exchangeValue.port = port
            exchangeValue
        }
    }
}