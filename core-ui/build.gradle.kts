plugins {
    id("com.android.library")
}

apply {
    from("$rootDir/compose-module.gradle")
}

android {
    namespace = ProjectConfig.namespace("core_ui")
}