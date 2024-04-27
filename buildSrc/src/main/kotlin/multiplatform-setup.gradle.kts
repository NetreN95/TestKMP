plugins {
    id("com.android.library")
    kotlin("multiplatform")
//    kotlin("kapt")
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
}