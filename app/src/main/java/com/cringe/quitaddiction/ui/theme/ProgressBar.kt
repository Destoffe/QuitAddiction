package com.cringe.quitaddiction.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MoneyProgressBar(progress: Float) {
    var progressText = progress.toInt().toString()
    Box(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.align(Alignment.Center).fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                "Day $progressText"
                ,fontSize = 36.sp,
               textAlign = TextAlign.Center
            )
            Row(horizontalArrangement = Arrangement.Center) {
                Text(
                    "without "
                )
                Text(
                    "nicotine ",
                    color = Color.Red
                )
            }

        }


        CircularProgressIndicator(progress = progress,
            strokeWidth = 16.dp,
            modifier = Modifier
                .align(Alignment.Center)
                .size(256.dp))
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProgressPreview() {
    QuitAddictionTheme {
        MoneyProgressBar(15f)
    }
}