plugins {
    alias(libs.plugins.spendless.android.feature.ui)
}

android {
    namespace = "com.shubhans.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}