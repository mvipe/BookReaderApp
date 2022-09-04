package com.learn.bookreader

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.firestore.FirebaseFirestore
import com.learn.bookreader.navigation.ReaderNavigation
import com.learn.bookreader.ui.theme.BookReaderTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookReaderTheme {
                BookReaderApp()
            }
        }
    }
}

@Composable
fun BookReaderApp() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .padding(top = 46.dp)) {
        
        Column(verticalArrangement = Arrangement.Center
        , horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ReaderNavigation()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BookReaderTheme {

    }
}