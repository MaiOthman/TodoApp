package com.example.todoapp.home

import android.content.Intent
import android.os.Bundle
import com.example.todoapp.base.Base
import com.example.todoapp.databinding.LayoutHomeBinding

class HomeActivity: Base<LayoutHomeBinding>() {
    val modelBottomSheet = AddTaskFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)
        binding!!.bottomNavigation.background = null
        binding!!.fab.setOnClickListener{
            modelBottomSheet.show(supportFragmentManager,AddTaskFragment.TAG)


        }
    }
    override fun initBinding(): LayoutHomeBinding = LayoutHomeBinding.inflate(layoutInflater)
    }

