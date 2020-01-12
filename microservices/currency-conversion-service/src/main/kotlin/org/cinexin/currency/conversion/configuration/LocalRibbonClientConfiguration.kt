package org.cinexin.currency.conversion.configuration

import com.netflix.loadbalancer.Server
import com.netflix.loadbalancer.ServerList
import org.springframework.cloud.netflix.ribbon.StaticServerList
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
open class LocalRibbonClientConfiguration {
    @Bean
    open fun ribbonServerList(): ServerList<Server>? { // return new ConfigurationBasedServerList();
        return StaticServerList<Server>(Server("localhost", 8001),
                Server("localhost", 8000))
    }
}