package org.cinexin.currency.conversion.configuration

import com.netflix.loadbalancer.IRule
import com.netflix.loadbalancer.RoundRobinRule
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
@RibbonClient(name="currency-exchange-service")
open class LocalRibbonClientConfiguration() {

    @Bean
    open fun loadBalancingRule(): IRule = RoundRobinRule()

}