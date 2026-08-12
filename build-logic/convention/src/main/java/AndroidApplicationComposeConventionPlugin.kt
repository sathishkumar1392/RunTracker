import com.android.build.api.dsl.ApplicationExtension
import com.sathish.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidApplicationComposeConventionPlugin : Plugin<Project> {
	override fun apply(target: Project) {
		target.run {
			pluginManager.apply("runtracker.android.application")
			val extensions =  extensions.getByType(ApplicationExtension::class.java)
		   configureAndroidCompose(extensions)
		}
	}
}