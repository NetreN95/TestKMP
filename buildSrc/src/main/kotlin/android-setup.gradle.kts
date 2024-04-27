plugins {
    id("com.android.library")
}

android {
    compileSdk = 34

    namespace = "ru.netren.dbapp"

    defaultConfig {
        minSdk = 24

//        testOptions.targetSdk = 34
//        lint.targetSdk = 34
//
//        targetSdk = 34
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    sourceSets {
        named("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            res.srcDirs("src/androidMain/res")
            resources.srcDirs("src/commonMain/resources")
        }
    }
}

//android {
//    namespace = "ru.netren.dbapp"
//    compileSdk = libs.versions.android.compileSdk.get().toInt()
//
//    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
//    sourceSets["main"].res.srcDirs("src/androidMain/res")
//    sourceSets["main"].resources.srcDirs("src/commonMain/resources")
//
//    defaultConfig {
//        applicationId = "ru.netren.dbapp"
//        minSdk = libs.versions.android.minSdk.get().toInt()
//        targetSdk = libs.versions.android.targetSdk.get().toInt()
//        versionCode = 1
//        versionName = "1.0"
//    }
//    packaging {
//        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
//        }
//    }
//    buildTypes {
//        getByName("release") {
//            isMinifyEnabled = false
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }
//    dependencies {
//        debugImplementation(libs.compose.ui.tooling)
//    }
//}