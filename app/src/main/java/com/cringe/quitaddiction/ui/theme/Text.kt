package com.cringe.quitaddiction.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.cringe.quitaddiction.R

@Composable
fun MoneySavedText(amount: String) {
    Row(modifier = Modifier.fillMaxWidth(),
    horizontalArrangement =  Arrangement.Center){
        Text(text = stringResource(id = R.string.dashboard_saved_money)
            ,fontSize = 24.sp)

        Text(text = stringResource(id = R.string.currency_saved,amount)
            ,fontSize = 24.sp,color = Green100)
    }

}

@Preview()
@Composable
fun DefaultPreview() {
    QuitAddictionTheme {
        MoneySavedText("5")
    }
}

