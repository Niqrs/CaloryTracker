plugins {
    id("com.android.library")
}

apply {
    from("$rootDir/base-module.gradle")
}

android {
    namespace = ProjectConfig.namespace("onboarding_domain")
}

dependencies {
    "implementation"(project(Modules.core))
}