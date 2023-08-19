package com.twofasapp.feature.home.ui.guides

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