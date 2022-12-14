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
        classpath("com.android.tools.build:gradle:8.0.0-alpha10")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.21")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}