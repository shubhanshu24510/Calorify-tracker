plugins {
    alias(libs.plugins.spendless.android.feature.ui)
}

android {
    namespace = "com.shubhans.feature.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.feature.domain)
}