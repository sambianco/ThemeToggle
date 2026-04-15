package com.example.themetoggle.ui.screens.theme

import com.example.themetoggle.data.models.Theme

data class ThemeState(
    val theme: Theme,
    val dynamicColor: Boolean
)

data class ThemeActions(
    val setTheme: (Theme) -> Unit,
    val setDynamicColor: (Boolean) -> Unit
)


