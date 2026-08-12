plugins {
    alias(libs.plugins.runtracker.android.library)

}

android {
    namespace = "com.sathish.run.network"

}

dependencies {
  implementation(projects.core.domain)
  implementation(projects.core.database)
}