package com.example.todoapp.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.todoapp.database.entities.Task
import java.util.Date

@Dao
interface TaskDao {
    @Query ("Select * from task")
    fun getAllTask(): List<Task>

    @Query("Select * from task where date = :date")
    fun getTaskByDate(date: Date)

    @Upsert
    fun InsertOrUpdateTask(task: Task)
    @Delete
    fun deleteTask(task: Task)

}