package com.cringe.quitaddiction.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RememberCard(text: String){
    Card(modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
    elevation = 5.dp) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = " Remember why you quit ", modifier = Modifier.padding(top = 16.dp))
            Text(text = "\"$text\"", fontSize = 34.sp,
                modifier = Modifier.padding(bottom = 16.dp))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RememberCardPreview() {
    QuitAddictionTheme() {
        RememberCard("Jag har inga vänner")
    }
}