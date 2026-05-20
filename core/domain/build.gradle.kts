plugins {
    id("com.android.library")
}

android {
    namespace = "com.nicolassnchz.sanchezpost1u11.domain"
    compileSdk = 36

    defaultConfig {
        minSdk = 24
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
}
