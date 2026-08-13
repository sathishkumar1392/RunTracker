plugins {
    alias(libs.plugins.runtracker.android.feature.ui)
}

android {
    namespace = "com.sathish.auth.presentation"
}

dependencies {
  implementation(projects.auth.domain)
  implementation(projects.core.domain)
}