package com.example.themetoggle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.themetoggle.ui.screens.theme.ThemeScreen
import com.example.themetoggle.ui.theme.ThemeToggleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThemeToggleTheme {
                ThemeScreen()
            }
        }
    }
}
