/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects,
 * please refer to https://docs.gradle.org/8.6/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    java
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)
    //testImplementation("org.mockito:mockito-core:5.11.0")
    //testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("commons-codec:commons-codec:1.16.1")
    implementation ("mysql:mysql-connector-java:8.0.33")
    //implementation("org.mariadb.jdbc:mariadb-java-client:3.3.3")
    //implementation("org.slf4j:slf4j-simple:2.0.13")
    //View
    //https://mvnrepository.com/artifact/com.github.lgooddatepicker/LGoodDatePicker
    //implementation("com.github.lgooddatepicker:LGoodDatePicker:11.2.1")
    // https://mvnrepository.com/artifact/com.github.spotbugs/spotbugs-annotations
    //implementation("com.github.spotbugs:spotbugs-annotations:4.8.4")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    // Define the main class for the application.
    mainClass = "unibo.mydiet.MyDiet"
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
