plugins {
    alias(libs.plugins.runtracker.android.feature.ui)
}

android {
    namespace = "com.sathish.run.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.run.domain)
}