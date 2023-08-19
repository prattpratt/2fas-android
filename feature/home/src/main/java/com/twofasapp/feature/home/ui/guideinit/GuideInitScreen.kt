package com.twofasapp.feature.home.ui.guideinit

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.twofasapp.feature.home.ui.guides.Guide

@Composable
internal fun GuideInitScreen(
    guide: Guide,
) {

}

@Preview
@Composable
private fun Preview() {
    GuideInitScreen(
        guide = Guide.Universal
    )
}