package com.example.customviewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.customviewcompose.samples.CanvasTest
import com.example.customviewcompose.samples.Oleg
import com.example.customviewcompose.ui.theme.CustomViewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Oleg()
        }
    }
}
