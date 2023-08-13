package com.twofasapp.feature.home.navigation

import androidx.compose.runtime.Composable
import com.twofasapp.feature.home.ui.guideinit.GuideInitScreen
import com.twofasapp.feature.home.ui.guidepager.GuidePagerScreen
import com.twofasapp.feature.home.ui.guides.Guide
import com.twofasapp.feature.home.ui.guides.GuidesScreen

@Composable
fun GuidesRoute(
    openGuide: (Guide) -> Unit,
) {
    GuidesScreen(
        openGuide = openGuide,
    )
}

@Composable
fun GuideInitRoute() {
    GuideInitScreen()
}

@Composable
fun GuidePagerRoute() {
    GuidePagerScreen()
}