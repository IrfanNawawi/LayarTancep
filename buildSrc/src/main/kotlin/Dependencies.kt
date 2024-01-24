/**
 * Created by Irfan Nawawi on 23/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
object AndroidProjectConfig {
    const val minSdk = 21
    const val compileSdk = 34
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
    const val applicationId = "id.heycoding.layartancep"
}

object Libraries {

    object Versions {
        const val coreKtx = "1.8.0"
        const val appcompat = "1.6.1"
        const val googleMaterial = "1.8.0"
        const val constraintLayout = "2.1.4"
        const val junit = "4.13.2"
        const val androidTestJunit = "1.1.5"
        const val espresso = "3.5.1"

        const val coroutine = "1.6.4"
        const val glide = "4.14.2"
        const val hdodenhof = "3.1.0"
        const val shimmer = "0.5.0"

        const val lifecycle = "2.6.1"
        const val androidxActivityKtx = "1.7.0"
        const val androidxFragmentKtx = "1.5.6"

        const val gson = "2.9.0"
        const val retrofit = "2.9.0"

        const val hiltAndroid = "2.44"
        const val hiltAndroidx = "1.0.0"

        const val navigationComponent = "2.5.3"
        const val roundedImageView = "2.3.0"
        const val chucker = "3.5.2"
        const val room = "2.4.2"
        const val jetpackDatastore = "1.0.0"
        const val coil = "2.1.0"
        const val exoplayer = "2.18.1"
        const val swipeRefreshLayout = "1.1.0"
    }

    const val androidxCoreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val androidxAppcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val googleAndroidMaterial =
        "com.google.android.material:material:${Versions.googleMaterial}"
    const val androidxConstraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val junit = "junit:junit:${Versions.junit}"
    const val androidJunit = "androidx.test.ext:junit:${Versions.androidTestJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    const val coroutineAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"
    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val hdodenhof = "de.hdodenhof:circleimageview:${Versions.hdodenhof}"
    const val shimmer = "com.facebook.shimmer:shimmer:${Versions.shimmer}"

    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val lifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleLiveDataKtx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"

    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hiltAndroid}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hiltAndroid}"
    const val androidxHiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltAndroidx}"

    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationComponent}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigationComponent}"
    const val navigationDynamic = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigationComponent}"

    const val roundedImage = "com.makeramen:roundedimageview:${Versions.roundedImageView}"

    const val chucker = "com.github.chuckerteam.chucker:library:${Versions.chucker}"
    const val chuckerNoOp = "com.github.chuckerteam.chucker:library-no-op:${Versions.chucker}"
    const val jetpackDatastore =
        "androidx.datastore:datastore-preferences:${Versions.jetpackDatastore}"
    const val coil = "io.coil-kt:coil:${Versions.coil}"
    const val exoplayer = "com.google.android.exoplayer:exoplayer:${Versions.exoplayer}"
    const val swipeRefreshLayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayout}"
}