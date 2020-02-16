package org.cinexin.limits

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.netflix.hystrix.EnableHystrix

@SpringBootApplication
@EnableHystrix
@EnableCircuitBreaker
open class LimitsServiceApplication

fun main(args: Array<String>) {
    runApplication<LimitsServiceApplication>(*args)
}
