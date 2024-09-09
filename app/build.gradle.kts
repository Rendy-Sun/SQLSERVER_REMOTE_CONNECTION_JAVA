plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.sqlserver_remote_connection"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.sqlserver_remote_connection"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    //No 1
    // add implementation("net.sourceforge.jtds:jtds:1.3.1")
    //then hover the code and replace with new library catalog declaration for jtds
    // after that, Sync Now for IDE to work properly
    //then go to android manifest for add permission internet
    implementation(libs.jtds)

}