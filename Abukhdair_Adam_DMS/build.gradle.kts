plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Using JUnit Platform BOM to manage versions of JUnit artifacts
    testImplementation(platform("org.junit:junit-bom:5.7.0"))

    // JUnit Jupiter API for writing tests
    testImplementation("org.junit.jupiter:junit-jupiter-api")

    // JUnit Jupiter Engine to run the tests
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
}
