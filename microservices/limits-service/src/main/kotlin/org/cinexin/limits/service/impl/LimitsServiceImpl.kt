package org.cinexin.limits.service.impl

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.cinexin.limits.config.Configuration
import org.cinexin.limits.domain.LimitConfiguration
import org.cinexin.limits.service.LimitsService
import org.springframework.stereotype.Service

/**
 * Implementation for [LimitsService]
 */
@Service
open class LimitsServiceImpl(private val configuration: Configuration): LimitsService {

    override fun getLimitsConfiguration(): LimitConfiguration
            = LimitConfiguration(configuration.getMaximum(), configuration.getMinimum())

    @HystrixCommand(fallbackMethod = "getDefaultLimits")
    override fun simulateFailure(): LimitConfiguration {
        throw RuntimeException("Error retrieving limits configuration. No default limits")
    }

    override fun getDefaultLimits(): LimitConfiguration  = LimitConfiguration.defaultLimits()
}