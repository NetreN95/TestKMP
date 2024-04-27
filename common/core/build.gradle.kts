plugins {
    id("multiplatform-setup")
    id("android-setup")
}

task("testClasses")

kotlin {
    sourceSets {
        commonMain {
            dependencies {

            }
        }
        androidMain {
            dependencies {

            }
        }
        desktopMain {
            dependencies {

            }
        }
    }
}