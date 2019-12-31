package org.cinexin.currency.exchange.repository

import org.cinexin.currency.exchange.domain.ExchangeValue
import org.springframework.data.jpa.repository.JpaRepository

interface ExchangeValueRepository: JpaRepository<ExchangeValue, Long> {
    fun findByFromAndTo(from: String, to: String): ExchangeValue?
}