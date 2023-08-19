package com.twofasapp.android.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

object NavArg {
    val Guide = navArgument("Guide") { type = NavType.StringType; }
    val GuideVariantIndex = navArgument("GuideVariantIndex") { type = NavType.IntType; }
}