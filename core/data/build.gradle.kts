plugins {
    alias(libs.plugins.spendless.android.library)
}

android {
    namespace = "com.shubhans.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.bundles.koin)
    implementation(projects.core.domain)
}