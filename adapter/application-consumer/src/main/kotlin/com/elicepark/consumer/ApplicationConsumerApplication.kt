package com.example.consumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApplicationConsumerApplication

fun main(args: Array<String>) {
    runApplication<ApplicationConsumerApplication>(*args)
}
