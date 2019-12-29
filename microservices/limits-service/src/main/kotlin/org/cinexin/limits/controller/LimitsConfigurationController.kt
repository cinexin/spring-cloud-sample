package org.cinexin.limits.controller

import org.cinexin.limits.config.Configuration
import org.cinexin.limits.domain.LimitConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LimitsConfigurationController(private val configuration: Configuration) {

    @GetMapping("/limits")
    fun retrieveLimitsFromConfiguration(): LimitConfiguration {
        return LimitConfiguration(configuration.getMaximum(), configuration.getMinimum())
    }
}