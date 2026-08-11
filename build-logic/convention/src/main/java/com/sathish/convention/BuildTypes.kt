package com.sathish.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.BuildType
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

internal fun Project.buildTypes(
    commonExtension: CommonExtension,
    extensionType: ExtensionType
) {
    commonExtension.run {
        val apiKey = gradleLocalProperties(rootDir, providers).getProperty("API_KEY")
        when (extensionType) {
            ExtensionType.APPLICATION -> {
                extensions.configure<ApplicationExtension> {
                    buildTypes {
                        debug {
                           configurableDebugBuildType(apiKey)
                        }

                        release {
                            configurableReleaseBuildType(commonExtension = commonExtension, apiKey = apiKey)
                        }
                    }
                }
            }

            ExtensionType.LIBRARY -> {
                extensions.configure<LibraryExtension> {
                    buildTypes {
                        debug {
                            configurableDebugBuildType(apiKey)
                        }

                        release {
                            configurableReleaseBuildType(commonExtension = commonExtension, apiKey = apiKey)
                        }
                    }
                }
            }
        }
    }
}

private fun BuildType.configurableDebugBuildType(apiKey:String){
    buildConfigField("String", "API_KEY","\"$apiKey\"")
    buildConfigField("String", "BASE_URL", "\"https://runique.pl-coding:8080\"")
}

private fun BuildType.configurableReleaseBuildType(commonExtension: CommonExtension,apiKey: String) {
    buildConfigField("String", "API_KEY","\"$apiKey\"")
    buildConfigField("String", "BASE_URL", "\"https://runique.pl-coding:8080\"")
    isMinifyEnabled = true
    proguardFiles(
        commonExtension.getDefaultProguardFile("proguard-android-optimize.txt"),"proguard-rules.pro"
    )
}