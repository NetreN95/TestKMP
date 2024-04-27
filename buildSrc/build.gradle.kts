plugins{
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader

//    alias(libs.plugins.androidApplication) apply false
//    alias(libs.plugins.androidLibrary) apply false
//    alias(libs.plugins.jetbrainsCompose) apply false
//    alias(libs.plugins.kotlinJvm) apply false
//    alias(libs.plugins.kotlinMultiplatform) apply false

    `kotlin-dsl`
}

repositories {
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
    gradlePluginPortal()
    mavenCentral()
}

dependencies{
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.kotlin.serialization.gradlePlugin)
//    implementation(libs.kotlin.serialization.serialization)
    implementation(libs.android.gradlePlugin)
    implementation(libs.compose.gradlePlugin)
}

//kotlin{
//    sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
//}