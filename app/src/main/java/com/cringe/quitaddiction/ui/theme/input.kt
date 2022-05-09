package com.cringe.quitaddiction.ui.theme

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier

@Composable
fun EditText(textba: String) {
    var text by remember { mutableStateOf(textba) }

    Row(modifier = Modifier.fillMaxWidth()) {

    }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    QuitAddictionTheme {
        EditText(textba = "hello")
    }
}