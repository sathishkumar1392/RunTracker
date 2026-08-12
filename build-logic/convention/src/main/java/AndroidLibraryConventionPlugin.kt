import com.android.build.api.dsl.LibraryExtension
import com.sathish.convention.ExtensionType
import com.sathish.convention.configureBuildTypes
import com.sathish.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class AndroidLibraryConventionPlugin : Plugin<Project> {
	override fun apply(target: Project) {
	   target.run {
		   pluginManager.run {
			   apply("com.android.library")

		   }

		   extensions.configure<LibraryExtension> {
			   configureKotlinAndroid( this)
			   configureBuildTypes(
				   commonExtension = this,
				   ExtensionType.LIBRARY
			   )

			   defaultConfig {
				   testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
				   consumerProguardFiles("consumer-rules.pro")
			   }
		   }

		   dependencies {
			   "testImplementation"(kotlin("test"))
		   }
	   }
	}


}