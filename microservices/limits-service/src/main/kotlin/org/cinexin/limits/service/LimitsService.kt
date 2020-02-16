package org.cinexin.limits.service

import org.cinexin.limits.domain.LimitConfiguration

interface LimitsService {

    fun getLimitsConfiguration(): LimitConfiguration

    fun simulateFailure(): LimitConfiguration

    fun getDefaultLimits(): LimitConfiguration
}