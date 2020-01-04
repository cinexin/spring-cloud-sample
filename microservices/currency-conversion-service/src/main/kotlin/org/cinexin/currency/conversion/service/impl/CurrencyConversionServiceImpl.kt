package org.cinexin.currency.conversion.service.impl

import org.cinexin.currency.conversion.domain.CurrencyConversionBean
import org.cinexin.currency.conversion.service.CurrencyConversionService
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.math.BigDecimal

@Service
class CurrencyConversionServiceImpl: CurrencyConversionService {

    private val currencyExchangeURI = "http://localhost:8000/currency-exchange/from/{from}/to/{to}"

    override fun convert(from: String, to: String, quantity: BigDecimal): CurrencyConversionBean {
        val uriVariables: Map<String, String> = hashMapOf(
                Pair("from", from),
                Pair("to", to)
        )
        val responseEntity = RestTemplate()
                .getForEntity(currencyExchangeURI, CurrencyConversionBean::class.java, uriVariables)
        val response = responseEntity.body!!

        return CurrencyConversionBean(response.id,
                from,
                to,
                response.conversionMultiple,
                quantity,
                quantity.multiply(response.conversionMultiple),
                response.port)
    }
}