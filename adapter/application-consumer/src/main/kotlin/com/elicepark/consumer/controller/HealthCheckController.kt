package com.elicepark.consumer.controller

import kotlinx.coroutines.coroutineScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Brian
 * @since 2023/04/10
 */
@RestController
@RequestMapping("/health")
class HealthCheckController {
    @GetMapping("")
    suspend fun healthCheck(): String = coroutineScope {
        return@coroutineScope "OK!"
    }
}