package com.araa.insta_todo.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.araa.insta_todo.ui.components.SearchBar
import com.araa.insta_todo.ui.components.UIButton
import com.araa.insta_todo.ui.components.UIFAButton
import com.araa.insta_todo.ui.theme.InstaTodoTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TodoScreen() {
    Surface (modifier = Modifier.fillMaxSize()){
        Scaffold (
            floatingActionButton = {
                UIFAButton(text = "Add ToDo", onClick = {})
            },
            content = {
                Surface{
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ){
                        SearchBar(onSearch = {})
                        UIButton(title = "Button1", onClick = {})
                        UIButton(title = "Button1", onClick = {})
                        UIButton(title = "Button1", onClick = {})
                        UIButton(title = "Button1", onClick = {})
                    }
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InstaTodoTheme {
        TodoScreen()

    }
}