plugins {
    alias(libs.plugins.spendless.android.feature.ui)
}

android {
    namespace = "com.shubhans.onboarding.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.presentation.ui)
    implementation(projects.core.presentation.designsystem)
}