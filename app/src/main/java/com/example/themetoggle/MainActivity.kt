package com.example.themetoggle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.themetoggle.ui.screens.theme.Theme
import com.example.themetoggle.ui.screens.theme.ThemeScreen
import com.example.themetoggle.ui.theme.ThemeToggleTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var selectedTheme by remember { mutableStateOf(Theme.System) }
            var dynamicColor by remember { mutableStateOf(true) }

            ThemeToggleTheme(
                darkTheme = when (selectedTheme) {
                Theme.Light-> false
                Theme.Dark-> true
                Theme.System-> isSystemInDarkTheme()
            },
                dynamicColor = dynamicColor) {
                ThemeScreen(
                    selectedTheme =  selectedTheme,
                    onThemeChange = { selectedTheme = it },
                    dynamicColor = dynamicColor,
                    onDynamicColorChange = { dynamicColor = it })
            }
        }
    }
}
