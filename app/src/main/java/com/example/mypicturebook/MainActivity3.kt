package com.example.mypicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btnButton = findViewById<Button>(R.id.btnThree)
        btnButton.setOnClickListener{
            val intent = Intent(baseContext,MainActivity4::class.java)
            startActivity(intent)
        }
    }
}
