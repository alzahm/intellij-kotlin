plugins {
    kotlin("js") version "KOTLIN_VERSION"
}

group = "testGroupId"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    js(LEGACY) {
        nodejs {
            binaries.executable()
        }
    }
}
