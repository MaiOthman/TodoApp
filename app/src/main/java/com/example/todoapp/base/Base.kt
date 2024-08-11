package com.example.todoapp.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class Base<T>:AppCompatActivity() {
    var binding:T? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = initBinding()
        }
    abstract fun initBinding():T
}