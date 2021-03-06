package com.cringe.quitaddiction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.cringe.quitaddiction.navigation.BottomNav
import com.cringe.quitaddiction.navigation.Navigation
import com.cringe.quitaddiction.navigation.Screens
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
                    MainView()
                }
            }
        }
    }
}

@Composable
fun WelcomeView(navController: NavController) {
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
                onClick = {navController.navigate(Screens.Dashboard.route)}) {
                Text("LETS QUIT")
            }
        }
    }
}

@Composable
fun Dashboard(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.padding(top = 64.dp)) {
            MoneySavedText("5")
            MoneyProgressBar(progress = 5f)
            RememberCard(text = "Jag har inga v??nner")
        }
    }

}

@Composable
fun MainView(){
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomNav(navController = navController) },) {
        padding ->
        Column(modifier = Modifier.padding(padding)) {
            Navigation(navController)
        }

    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    QuitAddictionTheme {
        MainView()
    }
}