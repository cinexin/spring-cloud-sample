package org.cinexin.currency.conversion

import org.cinexin.currency.conversion.configuration.LocalRibbonClientConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients("org.cinexin.currency.conversion")
@RibbonClient(name = "currency-conversion-service", configuration = [LocalRibbonClientConfiguration::class])
@EnableDiscoveryClient
open class CurrencyConversionServiceApplication

fun main(args: Array<String>) {
    runApplication<CurrencyConversionServiceApplication>(*args)
}