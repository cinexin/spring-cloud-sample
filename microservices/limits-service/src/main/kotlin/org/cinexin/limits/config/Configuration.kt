package org.cinexin.limits.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "limits-service")
class Configuration {
    private var minimum: Int = 0
    private var maximum: Int = 1000

    fun getMinimum(): Int = minimum
    fun getMaximum(): Int = maximum
    fun setMinimum(min: Int) {this.minimum = min}
    fun setMaximum(max: Int) {this.maximum = max}
}
