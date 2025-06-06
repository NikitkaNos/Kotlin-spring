plugins {
    kotlin("jvm") version "2.0.20"
}
description "chapter03"
group = "com.apress.prospring6"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.springframework:spring-context:6.0.6")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}