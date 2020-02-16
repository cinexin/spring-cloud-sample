package org.cinexin.limits.controller

import org.cinexin.limits.domain.LimitConfiguration
import org.cinexin.limits.service.LimitsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/limits")
class LimitsConfigurationController(private val limitsService: LimitsService) {

    @GetMapping
    fun retrieveLimitsFromConfiguration(): LimitConfiguration {
        return limitsService.getLimitsConfiguration()
    }

    @GetMapping("/fault-tolerance-example")

    fun retrieveConfiguration(): LimitConfiguration {
        return limitsService.simulateFailure()
    }
}