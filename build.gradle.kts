plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-dbcp2:2.9.0")
    implementation("org.telegram:telegrambots:6.3.0")
    implementation("org.jsoup:jsoup:1.15.3")
    implementation("org.mariadb.jdbc:mariadb-java-client:3.1.0")
    implementation("com.fasterxml.uuid:java-uuid-generator:4.0.1")
    implementation("org.bitbucket.cowwoc:diff-match-patch:1.2")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

application {
    mainClass.set("meal.LeckerSchmecker")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
