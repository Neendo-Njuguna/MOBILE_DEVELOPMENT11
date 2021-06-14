package com.example.mypicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    lateinit var btnButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        btnButton = findViewById<Button>(R.id.btnFive)
        btnButton.setOnClickListener {
            val intent = Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }

    }
}