package com.example.todoapp.home

import android.os.Bundle
import com.example.todoapp.base.Base
import com.example.todoapp.databinding.LayoutHomeBinding

class HomeActivity: Base<LayoutHomeBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)
    }
    override fun initBinding(): LayoutHomeBinding = LayoutHomeBinding.inflate(layoutInflater)
    }

