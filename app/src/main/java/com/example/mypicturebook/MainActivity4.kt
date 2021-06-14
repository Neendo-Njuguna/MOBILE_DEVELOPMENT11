package com.example.mypicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var btnButton = findViewById<Button>(R.id.btnFour)
        btnButton.setOnClickListener {
            val intent = Intent(baseContext, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}