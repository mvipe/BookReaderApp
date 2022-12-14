package com.learn.bookreader.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ReaderLogoText(modifier: Modifier=Modifier) {
    Text(
        modifier = modifier.padding(bottom = 16.dp),
        text = "Book Reader",
        style = MaterialTheme.typography.headlineMedium,
        color = Color.Red.copy(alpha = 0.5f)
    )
}