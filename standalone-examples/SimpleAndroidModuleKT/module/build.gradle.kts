plugins {
    id("com.viam.sdk.android.module") version ("1.0-SNAPSHOT")
    id("org.jetbrains.kotlin.android")
}

module {
    mainEntryClass = "com.example.mymodule.Main"
}

android {
    namespace = "com.example.mymodule"
    compileSdk = 34

    defaultConfig {
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("com.viam:viam-android-sdk:1.0-SNAPSHOT")
}