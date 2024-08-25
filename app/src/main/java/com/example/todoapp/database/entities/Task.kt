package com.example.todoapp.database.entities

import android.app.ActivityManager.TaskDescription
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val title:String? = null,
    val description: String? = null,
    val date: Date? = null,
    val time: Long? = null,
    val isDone: Boolean? = false
)

