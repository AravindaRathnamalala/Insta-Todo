package com.araa.insta_todo.data.db.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.araa.insta_todo.data.Todo
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Upsert
    fun upsertTodo(todo: Todo)

    @Delete
    fun deleteTodo(todo: Todo)

//    @Query("SELECT * FROM todo ORDER BY date ASC")
//    fun getContactsOrderByFirstName(): Flow<List<Todo>>

}
