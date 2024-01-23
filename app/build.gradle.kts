plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
//    id("dagger.hilt.android.plugin")
    id("kotlin-parcelize")
}

android {
    namespace = AndroidProjectConfig.applicationId
    compileSdk = AndroidProjectConfig.compileSdk

    defaultConfig {
        applicationId = AndroidProjectConfig.applicationId
        minSdk = AndroidProjectConfig.minSdk
        targetSdk = AndroidProjectConfig.targetSdk
        versionCode = AndroidProjectConfig.versionCode
        versionName = AndroidProjectConfig.versionName

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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

//    implementation 'androidx.core:core-ktx:1.7.0'
//    implementation 'androidx.appcompat:appcompat:1.6.1'
//    implementation 'com.google.android.material:material:1.8.0'
//    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
//    testImplementation 'junit:junit:4.13.2'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
//
//    // Coroutines
//    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4'
//    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4'
//    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.4'
//
//    // Glide
//    implementation 'com.github.bumptech.glide:glide:4.14.2'
//
//    // Hdodenhof
//    implementation 'de.hdodenhof:circleimageview:3.1.0'
//
//    // Shimmer
//    implementation "com.facebook.shimmer:shimmer:0.5.0"
//
//    // Lifecycle
//    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1"
//    implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"
//    implementation "androidx.activity:activity-ktx:1.7.0"
//    implementation "androidx.fragment:fragment-ktx:1.5.6"
//
//    // Retrofit
//    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
//    implementation "com.squareup.retrofit2:converter-gson:2.9.0"
//    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
//    implementation 'com.squareup.okhttp3:okhttp:5.0.0-alpha.6'
//    implementation "com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.6"
//
//    // Hilt
//    implementation "com.google.dagger:hilt-android:2.44"
//    kapt "com.google.dagger:hilt-compiler:2.44"
//    kapt "androidx.hilt:hilt-compiler:1.0.0"
//    androidTestImplementation "com.google.dagger:hilt-android-testing:2.44"
//
//    // Navigation
//    implementation "androidx.navigation:navigation-fragment-ktx:2.5.3"
//    implementation "androidx.navigation:navigation-ui-ktx:2.5.3"
//    implementation "androidx.navigation:navigation-dynamic-features-fragment:2.5.3"
//
//    // Rounded ImageView
//    implementation "com.makeramen:roundedimageview:2.3.0"
}