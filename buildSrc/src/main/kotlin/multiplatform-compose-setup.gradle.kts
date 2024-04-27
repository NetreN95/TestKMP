plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    jvm("desktop")
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }

    sourceSets {
        named("commonMain") {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
            }
        }

        named("desktopMain") {
            dependencies {
                implementation(compose.desktop.common)
//                implementation(compose.desktop.currentOs)
            }
        }

//        named("androidMain"){
//
//        }
    }
}