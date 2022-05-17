package com.cringe.quitaddiction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cringe.quitaddiction.ui.theme.ExposedEditText
import com.cringe.quitaddiction.ui.theme.MoneyProgressBar
import com.cringe.quitaddiction.ui.theme.MoneySavedText
import com.cringe.quitaddiction.ui.theme.OutlinedEditText
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
                    Dashboard()
                }
                Dashboard()
            }
        }
    }
}

@Composable
fun WelcomeView() {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.padding(vertical = 64.dp),
                text = "Welcome!",
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )
            ExposedEditText("Android")
            OutlinedEditText("How much do you spend daily?")
            OutlinedEditText("What's your first goal?")
        }

        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
                onClick = {}) {
                Text("LETS QUIT")
            }
        }
    }
}

@Composable
fun Dashboard() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.padding(top = 64.dp)) {
            MoneySavedText("5")
            MoneyProgressBar(progress = 5f)
            RememberCard(text = "Jag har inga vänner")
        }
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    QuitAddictionTheme {
        Dashboard()
    }
}