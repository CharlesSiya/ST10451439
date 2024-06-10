package com.example.myarrayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
    val startButton = findViewById<Button>(R.id.startButton)
    val exitButton = findViewById<Button>(R.id.exitButton)

    startButton.setOnClickListener {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    exitButton.setOnClickListener {
        finish()
    }








}









