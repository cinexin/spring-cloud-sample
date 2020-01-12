package org.cinexin.currency.conversion.service

import org.cinexin.currency.conversion.domain.CurrencyConversionServiceImplementation
import org.cinexin.currency.conversion.service.impl.CurrencyConversionServiceFeignImpl
import org.cinexin.currency.conversion.service.impl.CurrencyConversionServiceImpl
import org.springframework.stereotype.Service

@Service
class CurrencyConversionServiceSelector(private val currencyConversionServiceFeignImpl: CurrencyConversionServiceFeignImpl,
                                        private val currencyConversionServiceImpl: CurrencyConversionServiceImpl) {

    fun forImplementation(implementation: CurrencyConversionServiceImplementation): CurrencyConversionService {
        return when (implementation) {
            CurrencyConversionServiceImplementation.REST_TEMPLATE -> currencyConversionServiceImpl
            CurrencyConversionServiceImplementation.OPEN_FEIGN -> currencyConversionServiceFeignImpl
        }
    }
}