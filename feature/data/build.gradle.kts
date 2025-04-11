plugins {
    alias(libs.plugins.spendless.android.library)
}

android {
    namespace = "com.shubhans.feature.data"
}

dependencies {
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
    implementation(projects.feature.domain)
}