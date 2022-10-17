package com.yakuruto.yagateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YaGatewayApplication

fun main(args: Array<String>) {
    runApplication<YaGatewayApplication>(*args)
}
