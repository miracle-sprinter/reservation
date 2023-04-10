rootProject.name = "miracle-reservation"

pluginManagement {
    val kotlinVersion = "1.8.10"
    val springBootVersion = "2.7.9"
    val dependencyManagementVersion = "1.0.15.RELEASE"
    val protobufVersion = "0.8.15" // for gRPC

    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version dependencyManagementVersion
        id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
        id("org.jetbrains.kotlin.plugin.noarg") version kotlinVersion
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion

        kotlin("kapt") version kotlinVersion

        id("com.google.protobuf") version protobufVersion // gRPC
    }
}

include(
    "commons:common"
)

include(
    "domain"
)

include(
    "port:dto",
    "port:repository",
    "port:service",
    "port:messaging-interface"
)

include(
    "adapter:dao",
    "adapter:application-consumer",
    "adapter:application-user"
)