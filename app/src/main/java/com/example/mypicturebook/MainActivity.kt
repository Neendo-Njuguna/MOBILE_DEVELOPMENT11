package com.example.mypicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnButton = findViewById<Button>(R. id. btnOne)
        btnButton.setOnClickListener {
            val intent = Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}