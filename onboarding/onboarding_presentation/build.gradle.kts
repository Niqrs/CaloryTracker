plugins {
    id("com.android.library")
}

apply {
    from("$rootDir/compose-module.gradle")
}

android {
    namespace = ProjectConfig.namespace("onboarding_presentation")
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.coreUi))
    "implementation"(project(Modules.onboardingDomain))
}