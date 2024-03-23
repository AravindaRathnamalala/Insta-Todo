package com.araa.insta_todo.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.araa.insta_todo.ui.components.SearchBar
import com.araa.insta_todo.ui.components.UIButton
import com.araa.insta_todo.ui.theme.InstaTodoTheme
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstaTodoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column {
        SearchBar(onSearch = {})
        UIButton(title = "Button1", onClick = {})
        UIButton(title = "Button1", onClick = {})
        UIButton(title = "Button1", onClick = {})
        UIButton(title = "Button1", onClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InstaTodoTheme {
        MainScreen()

    }
}