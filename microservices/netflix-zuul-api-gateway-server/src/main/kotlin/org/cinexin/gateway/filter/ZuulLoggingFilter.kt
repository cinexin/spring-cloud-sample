package org.cinexin.gateway.filter

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class ZuulLoggingFilter: ZuulFilter() {

    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun run(): Any {
        val currentHttpRequest = RequestContext.getCurrentContext().request
        logger.info("request -> $currentHttpRequest request uri -> ${currentHttpRequest.requestURI}")
        return currentHttpRequest
    }
    override fun shouldFilter(): Boolean = true

    override fun filterType(): String = "pre"

    override fun filterOrder(): Int = 1
}