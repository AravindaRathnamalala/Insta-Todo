package com.araa.insta_todo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.araa.insta_todo.data.Todo
import com.araa.insta_todo.data.db.local.TodoDao

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {
    abstract val dao: TodoDao
}