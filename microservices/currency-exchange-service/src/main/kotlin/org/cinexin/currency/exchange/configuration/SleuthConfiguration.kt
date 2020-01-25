package org.cinexin.currency.exchange.configuration

import brave.sampler.Sampler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class SleuthConfiguration {

    @Bean
    open fun defaultConfig(): Sampler = Sampler.ALWAYS_SAMPLE
}