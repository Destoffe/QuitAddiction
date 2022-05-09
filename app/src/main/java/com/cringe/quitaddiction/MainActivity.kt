package com.cringe.quitaddiction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.cringe.quitaddiction.ui.theme.MoneySavedText
import com.cringe.quitaddiction.ui.theme.QuitAddictionTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuitAddictionTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Dashboard(name: String) {
    MoneySavedText("5")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QuitAddictionTheme {
        Dashboard("Android")
    }
}