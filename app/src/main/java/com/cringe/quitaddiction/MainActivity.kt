package com.cringe.quitaddiction

import android.os.Bundle
import android.widget.ProgressBar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.cringe.quitaddiction.ui.theme.MoneyProgressBar
import com.cringe.quitaddiction.ui.theme.MoneySavedText
import com.cringe.quitaddiction.ui.theme.QuitAddictionTheme
import com.cringe.quitaddiction.ui.theme.RememberCard
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuitAddictionTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Dashboard("Android")
                }
            }
        }
    }
}

@Composable
fun Dashboard(name: String) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.padding(top = 64.dp)) {
            MoneySavedText("5")
            MoneyProgressBar(progress = 5f)
            RememberCard(text = "Jag har inga vänner")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QuitAddictionTheme {
        Dashboard("Android")
    }
}