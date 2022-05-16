package com.cringe.quitaddiction.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedEditText(label: String) {
    var text by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.Center
    ) {

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(label) }
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ExposedEditText(inputText: String) {
    var expanded by remember { mutableStateOf(true) }
    var options = listOf("alkohol", "skitsamma", "test")
    var selectedOptionText by remember { mutableStateOf(options[0]) }

    Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.Center
    ) {

        ExposedDropdownMenuBox(expanded = expanded, onExpandedChange = { expanded = !expanded }) {
            TextField(
                value = selectedOptionText,
                onValueChange = {},
                label = { Text("What's your addiction?") },
                readOnly = true
            )
            ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                options.forEach {
                    DropdownMenuItem(onClick = {
                        expanded = false
                        selectedOptionText = it
                    }) {
                        Text(text = it)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    QuitAddictionTheme {
        ExposedEditText(inputText = "hello")
    }
}