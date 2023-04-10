dependencies {
    implementation("org.springframework.boot:spring-boot-starter-aop")
}

tasks {
    named<Jar>("jar") {
        enabled = true
    }

    named<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
        enabled = false
    }
}