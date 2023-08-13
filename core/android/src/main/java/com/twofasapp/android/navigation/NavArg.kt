package com.twofasapp.android.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

object NavArg {
    val Guide = navArgument("guide") { type = NavType.StringType; }
}