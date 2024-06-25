plugins {
    id("java")
}

group = "lip6"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("io.github.bonede:tree-sitter:0.22.6")
    implementation("io.github.bonede:tree-sitter-json:0.21.0a")
}

tasks.test {
    useJUnitPlatform()
}