package com.example.todoapp.database.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todoapp.database.dao.TaskDao
import com.example.todoapp.database.entities.Task

@Database(entities = [Task::class], version = 1)

abstract class TaskDatabase: RoomDatabase() {
    abstract fun taskDao(): TaskDao

    companion object {
        private var instance: TaskDatabase? = null
        private val DATABASE_NAME = "task database"
        fun getInstance(context: Context): TaskDatabase {
            if (instance == null)
                instance = Room.databaseBuilder(
                    context,
                    TaskDatabase::class.java, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
                return instance!!
        }

    }

}