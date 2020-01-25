package org.cinexin.gateway.config

import brave.sampler.Sampler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class SleuthConfig {

    @Bean
    open fun defaultSampler(): Sampler = Sampler.ALWAYS_SAMPLE
}