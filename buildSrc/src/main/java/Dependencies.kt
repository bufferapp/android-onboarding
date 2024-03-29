object Versions {
    val minSdk = 21
    val targetSdk = 28
    val compileSdk = 28
    val kotlin = "1.3.71"
    val dagger = "2.16"
    val rxKotlin = "2.0.3"
    val rxJava = "2.0.7"
    val rxAndroid = "2.0.1"
    val javaxAnnotation = "1.0"
    val javaxInject = "1"
    val pusher = "1.6.0"
    val sqlBrite = "2.0.0"
    val material = "1.1.0"
    val gson = "2.8.5"
    val hamcrest = "1.3"
    val twitterText = "2.0.8"
    val arch_testing = "2.0.0"
    val archComponents = "1.1.1"
    val navigationComponent = "1.0.0"
    val imageCropper = "2.8.0"
    val thumby = "666142a778"
    val socialLinkify = "1.4"
    val jodaTime = "2.10.1"
    val rxBinding = "0.4.0"
    val rxBinding2 = "2.0.0"
    val rxPreferences = "59b3f0e3fa"
    val rxLint = "1.7.4"
    val okHttp = "3.12.1"
    val androidAnnotations = "21.0.3"
    val supportLibrary = "28.0.0"
    val androidx = "1.0.2"
    val retrofit = "2.5.0"
    val firebaseCore = "16.0.8"
    val firebasePerformance = "16.2.3"
    val firebaseMessaging = "17.6.0"
    val firebaseFirestore = "18.2.0"
    val firebaseAuth = "16.2.1"
    val firebaseConfig = "16.5.0"
    val timber = "4.7.1"
    val photoView = "2.3.0"
    val glide = "4.8.0"
    val glideOkHttp = "4.8.0"
    val circleImageView = "2.2.0"
    val playBilling = "1.0"
    val reactiveBilling = "1.0"
    val constraintLayout = "1.0.2"
    val room = "1.1.1"
    val room_android_x = "2.0.0"
    val beacon = "1.0.1"
    val facebookLogin = "5.0.1"
    val bufferComponents = "0.17"
    val counterView = "-115e659a89"

    val glassfishAnnotation = "10.0-b28"
    val multidex = "1.0.3"
    val crashlytics = "2.9.6"
    val exoplayer = "2.9.6"
    val jackson = "2.9.8"
    val jobDispatcher = "0.8.5"

    val robolectric = "3.5.1"
    val jUnit = "4.12"
    val assertJ = "3.12.2"
    val mockito = "1.9.5"
    val dexmaker = "1.0"
    val espresso = "3.1.0"
    val testingSupportLib = "0.1"
    val mockitoKotlin = "1.6.0"
    val mockitoKotlinTwo = "2.0.0-RC3"
    val mockitoAndroid = "2.23.0"
    val androidSupportRunner = "1.0.2"
    val androidSupportRules = "1.0.2"
    val dexmakerMockito = "2.2.0"
    val runner = "1.0.2"
    val espressoSupport = "1.0.0"
    val biscotti = "cc34682799"
    val uiAutomator = "2.1.3"
}

object Deps {
    val multidex = "com.android.support:multidex:${Versions.multidex}"
    val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"
    val exoplayer = "com.google.android.exoplayer:exoplayer:${Versions.exoplayer}"
    val design = "com.android.support:design:${Versions.supportLibrary}"
    val exif_interface = "com.android.support:exifinterface:${Versions.supportLibrary}"
    val custom_tabs = "com.android.support:customtabs:${Versions.supportLibrary}"
    val recyclerview_v7 = "com.android.support:recyclerview-v7:${Versions.supportLibrary}"
    val cardview_v7 = "com.android.support:cardview-v7:${Versions.supportLibrary}"
    val appcompat_v7 = "androidx.appcompat:appcompat:${Versions.androidx}"
    val support_v13 = "com.android.support:support-v13:${Versions.supportLibrary}"
    val support_v4 = "com.android.support:support-v4:${Versions.supportLibrary}"
    val constraint_layout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
    val material = "com.google.android.material:material:${Versions.material}"
    val buffer_components = "com.github.bufferapp:android-components:503b7ea"
    val counter_view = "com.github.bufferapp:CounterView:${Versions.counterView}"

    val javax_annotation = "javax.annotation:jsr250-api:${Versions.javaxAnnotation}"
    val javax_inject = "javax.inject:javax.inject:${Versions.javaxInject}"
    val pusher = "com.pusher:pusher-java-client:${Versions.pusher}"

    val rx_kotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    val rx_java = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    val rx_android = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    val rx_binding = "com.jakewharton.rxbinding:rxbinding:${Versions.rxBinding}"
    val rx_binding_2 = "com.jakewharton.rxbinding2:rxbinding:${Versions.rxBinding2}"
    val rx_preferences = "com.github.f2prateek:rx-preferences:${Versions.rxPreferences}"
    val rx_lint = "nl.littlerobots.rxlint:rxlint:${Versions.rxLint}"

    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val sql_brite = "com.squareup.sqlbrite2:sqlbrite:${Versions.sqlBrite}"
    val gson = "com.google.code.gson:gson:${Versions.gson}"
    val joda_time = "net.danlew:android.joda:${Versions.jodaTime}"
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    val twitter_text = "com.twitter.twittertext:twitter-text:${Versions.twitterText}"

    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glide_okhttp = "com.github.bumptech.glide:okhttp3-integration:${Versions.glideOkHttp}"
    val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    val circle_image_view = "de.hdodenhof:circleimageview:${Versions.circleImageView}"
    val photo_view = "com.github.chrisbanes:PhotoView:${Versions.photoView}"
    val image_cropper = "com.theartofdev.edmodo:android-image-cropper:${Versions.imageCropper}"
    val thumby = "com.github.bufferapp:Thumby:${Versions.thumby}"

    val room_runtime = "android.arch.persistence.room:runtime:${Versions.room}"
    val room_compiler = "androidx.room:room-compiler:${Versions.room_android_x}"
    val room_rx_java = "android.arch.persistence.room:rxjava2:${Versions.room}"

    val arch_runtime = "android.arch.lifecycle:runtime:${Versions.archComponents}"
    val arch_extensions = "android.arch.lifecycle:extensions:${Versions.archComponents}"
    val arch_compiler = "android.arch.lifecycle:compiler:${Versions.archComponents}"

    val navigation_fragment = "android.arch.navigation:navigation-fragment-ktx:${Versions.navigationComponent}"
    val navigation_ui = "android.arch.navigation:navigation-ui-ktx:${Versions.navigationComponent}"

    val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    val dagger_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    val dagger_processor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    val glassfish = "org.glassfish:javax.annotation:${Versions.glassfishAnnotation}"

    val firebase_core = "com.google.firebase:firebase-core:${Versions.firebaseCore}"
    val firebase_messaging = "com.google.firebase:firebase-messaging:${Versions.firebaseMessaging}"
    val firebase_performance = "com.google.firebase:firebase-perf:${Versions.firebasePerformance}"
    val firebase_job = "com.firebase:firebase-jobdispatcher:${Versions.jobDispatcher}"
    val firebase_firestore =  "com.google.firebase:firebase-firestore:${Versions.firebaseFirestore}"
    val firebase_auth = "com.google.firebase:firebase-auth:${Versions.firebaseAuth}"
    val firebase_config = "com.google.firebase:firebase-config:${Versions.firebaseConfig}"

    val jackson_core = "com.fasterxml.jackson.core:jackson-core:${Versions.jackson}"
    val jackson_annotations = "com.fasterxml.jackson.core:jackson-annotations:${Versions.jackson}"
    val jackson_databind = "com.fasterxml.jackson.core:jackson-databind:${Versions.jackson}"

    val android_annotations = "com.android.support:support-annotations:${Versions.androidAnnotations}"
    val ok_http = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    val ok_http_logger = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofit_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val retrofit_xml = "com.squareup.retrofit2:converter-simplexml:${Versions.retrofit}"
    val retrofit_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"

    val play_billing = "com.android.billingclient:billing:${Versions.playBilling}"
    val reactive_billing = "org.buffer.android:reactive-play-billing:${Versions.reactiveBilling}"
    val beacon_core = "com.helpscout:beacon-core:${Versions.beacon}"
    val beacon_ui = "com.helpscout:beacon-ui:${Versions.beacon}"
    val social_linkify = "org.buffer.android:social-linkify:${Versions.socialLinkify}"
    val facebook_login = "com.facebook.android:facebook-login:${Versions.facebookLogin}"

    val junit = "junit:junit:${Versions.jUnit}"
    val junit_kotlin = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    val hamcrest_core = "org.hamcrest:hamcrest-core:${Versions.hamcrest}"
    val hamcrest_library = "org.hamcrest:hamcrest-library:${Versions.hamcrest}"
    val hamcrest_integration = "org.hamcrest:hamcrest-integration:${Versions.hamcrest}"
    val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    val mockito_kotlin = "com.nhaarman:mockito-kotlin:${Versions.mockitoKotlin}"
    val mockito_kotlin_two = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlinTwo}"
    val mockito_android = "org.mockito:mockito-android:${Versions.mockitoAndroid}"
    val assertj = "org.assertj:assertj-core:${Versions.assertJ}"
    val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    val room_testing = "android.arch.persistence.room:testing:${Versions.room}"
    val arch_testing = "androidx.arch.core:core-testing:${Versions.arch_testing}"

    val support_runner = "androidx.test:runner:${Versions.androidSupportRunner}"
    val support_rules = "androidx.test:rules:${Versions.androidSupportRules}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val espresso_intents = "androidx.test.espresso:espresso-intents:${Versions.espresso}"
    val espresso_contrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    val espresso_a11y = "androidx.test.espresso:espresso-accessibility:${Versions.espresso}"
    val espresso_support = "com.novoda:espresso-support:${Versions.espressoSupport}"
    val espresso_support_extras = "com.novoda:espresso-support-extras:${Versions.espressoSupport}"
    val biscotti = "com.github.bufferapp:Biscotti:${Versions.biscotti}"
    val ui_automator = "com.android.support.test.uiautomator:uiautomator-v18:${Versions.uiAutomator}"
}
