plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    implementation ("org.seleniumhq.selenium:selenium-java:3.141.59")

}

tasks.test {
    useJUnitPlatform()
}