object ProjectConfig {
    const val appId = "com.plcoding.calorytracker"
    const val compileSdk = 33
    const val minSdk = 26
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
    const val namespacePrefix = "com.plcoding"
    fun namespace(module: String) = namespacePrefix + "." + module
}