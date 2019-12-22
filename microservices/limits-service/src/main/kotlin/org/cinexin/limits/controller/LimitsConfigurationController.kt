package org.cinexin.limits.controller

import org.cinexin.limits.domain.LimitConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LimitsConfigurationController {

    @GetMapping("/limits")
    fun retrieveLimitsFromConfiguration(): LimitConfiguration {
        return LimitConfiguration(1000, 1)
    }
}