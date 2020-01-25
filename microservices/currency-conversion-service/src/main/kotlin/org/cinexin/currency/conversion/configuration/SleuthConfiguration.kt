package org.cinexin.currency.conversion.configuration

import brave.sampler.Sampler
import org.springframework.context.annotation.Configuration

@Configuration
open class SleuthConfiguration {

    open fun defaultSampler(): Sampler = Sampler.ALWAYS_SAMPLE
}