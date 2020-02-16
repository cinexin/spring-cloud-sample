package org.cinexin.limits.domain

data class LimitConfiguration(
        var maximum: Int,

        var minimum: Int
) {
    constructor() : this(0, 0)

    companion object {
        fun defaultLimits() = LimitConfiguration(999,9 )
    }
}