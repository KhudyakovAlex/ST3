import org.gradle.api.tasks.Sync

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.st3"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.st3"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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

// Sync Pixso/exported design assets from repository root `ASSETS/` into the Android app assets.
val syncDesignAssets by tasks.registering(Sync::class) {
    group = "assets"
    description = "Sync root ASSETS/ into app/src/main/assets/design for packaging into the APK."

    from(rootProject.layout.projectDirectory.dir("ASSETS"))
    into(layout.projectDirectory.dir("src/main/assets/design"))
    includeEmptyDirs = false
}

tasks.named("preBuild") {
    dependsOn(syncDesignAssets)
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidsvg)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}