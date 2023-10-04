import coil.setupLibraryModule

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("dev.drewhamilton.poko")
}

setupLibraryModule(name = "coil.gif")

dependencies {
    api(projects.coilBase)

    implementation(libs.androidx.core)
    implementation(libs.androidx.vectordrawable.animated)

    testImplementation(projects.coilTestInternal)
    testImplementation(libs.bundles.test.jvm)

    androidTestImplementation(projects.coilTestInternal)
    androidTestImplementation(libs.bundles.test.android)
}
