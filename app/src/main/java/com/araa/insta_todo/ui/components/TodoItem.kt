package com.araa.insta_todo.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.araa.insta_todo.data.Todo
import java.util.UUID

@Composable
fun TodoCard(todo: Todo) {
    Card (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),

        shape = RoundedCornerShape(5.dp),

    ){
        Row {
            Text(text = todo.title)
            Text(text = todo.description)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TodoCardPreview(
) {
//    Todo(
//        id = UUID.randomUUID().toString(),
//        title = "Sample",
//        description = "nksvscndcs vcdccwcw cwccw"
//    )
}
