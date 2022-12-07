// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath (Build.androidBuildTools)
        classpath (Build.hiltAndroidGradlePlugin)
        classpath (Build.kotlinGradlePlugin)
        classpath("com.android.tools.build:gradle:8.0.0-alpha09")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}