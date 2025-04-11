plugins {
    alias(libs.plugins.spendless.android.application.compose)
}

android {
    namespace = "com.shubhans.calorify"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    // Use the Compose bundle
    implementation(libs.bundles.compose)

    // Core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    // Crypto
    implementation(libs.androidx.security.crypto.ktx)

    // Testing dependencies
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.bundles.compose.test)

    // Debug dependencies
    debugImplementation(libs.bundles.compose.debug)

    // Timber
    implementation(libs.timber)

    // Implement local modules
    implementation(projects.auth.domain)
    implementation(projects.auth.data)
    implementation(projects.auth.presentation)

    implementation(projects.onboarding.presentation)

    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.core.presentation.designsystem)
    implementation(projects.core.presentation.ui)
}