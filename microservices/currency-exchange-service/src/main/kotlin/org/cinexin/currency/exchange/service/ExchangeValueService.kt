package org.cinexin.currency.exchange.service

import org.cinexin.currency.exchange.domain.ExchangeValue

interface ExchangeValueService {

    fun retrieveExchangeValue(from: String, to: String, port: Int): ExchangeValue?
}