package com.application.cognimate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.application.cognimate.dashboard.HomeScreen
import com.application.cognimate.ui.theme.CognimateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CognimateTheme {
                HomeScreen()
            }
        }
    }
}
