package com.twofasapp.feature.home.ui.guides

import android.content.Context
import com.twofasapp.feature.home.R
import java.io.IOException

enum class Guide {
    Facebook,
    Twitter,
    Amazon,
    Universal,
    ;
}

val Guide.json: String
    get() = when (this) {
        Guide.Facebook -> "facebook.json"
        Guide.Twitter -> "twitter.json"
        Guide.Amazon -> "amazon.json"
        Guide.Universal -> "universal.json"
    }

val Guide.image: Int
    get() = when (this) {
        Guide.Facebook -> R.drawable.img_services_empty
        Guide.Twitter -> R.drawable.img_services_empty
        Guide.Amazon -> R.drawable.img_services_empty
        Guide.Universal -> R.drawable.img_services_empty
    }

internal fun Context.getGuideJson(fileName: String): String {
    return try {
        assets.open(fileName).bufferedReader().use { it.readText() }
    } catch (ioException: IOException) {
        ioException.printStackTrace()
        ""
    }
}