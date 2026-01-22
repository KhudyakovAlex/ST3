package com.example.st3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.st3.ui.theme.ST3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ST3Theme {
                MainContent()
            }
        }
    }
}

@Composable
private fun MainContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        UIButtons(modifier = Modifier.fillMaxSize())
        UIAI(modifier = Modifier.fillMaxSize())
    }
}

@Preview(showBackground = true)
@Composable
private fun MainPreview() {
    ST3Theme {
        MainContent()
    }
}
