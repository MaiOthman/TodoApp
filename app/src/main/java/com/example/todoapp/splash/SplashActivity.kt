package com.example.todoapp.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.todoapp.R
import com.example.todoapp.base.Base
import com.example.todoapp.databinding.LayoutSplashBinding
import com.example.todoapp.home.HomeActivity

class SplashActivity:Base<LayoutSplashBinding>() {
    override fun initBinding(): LayoutSplashBinding = LayoutSplashBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)
        Handler(Looper.getMainLooper()).postDelayed({navigateHome()},3000)
    }
    fun navigateHome(){
        val intent = Intent(this@SplashActivity, HomeActivity::class.java)
        startActivity(intent)
    }
}