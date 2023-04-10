package com.elicepark.messaging

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MessagingInterfaceApplication

fun main(args: Array<String>) {
    runApplication<MessagingInterfaceApplication>(*args)
}
