package org.cinexin.currency.conversion.service.impl

import org.cinexin.currency.conversion.domain.CurrencyConversionBean
import org.cinexin.currency.conversion.feignclients.CurrencyExchangeProxy
import org.cinexin.currency.conversion.service.CurrencyConversionService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class CurrencyConversionServiceFeignImpl(private val currencyExchangeProxy: CurrencyExchangeProxy)
    : CurrencyConversionService {

    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun convert(from: String, to: String, quantity: BigDecimal): CurrencyConversionBean {
        val exchangeValue = currencyExchangeProxy.retrieveExchangeValue(from, to)

        logger.info("Exchange value: $exchangeValue")

        return exchangeValue?.let {
            CurrencyConversionBean(
                    exchangeValue.id,
                    from,
                    to,
                    exchangeValue.conversionMultiple,
                    quantity,
                    quantity.multiply(exchangeValue.conversionMultiple),
                    exchangeValue.port)
        } ?: CurrencyConversionBean(
                0L,
                from,
                to,
                BigDecimal.ONE,
                quantity,
                quantity,
                0)
    }
}