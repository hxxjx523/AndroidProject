package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val btn1 = findViewById<Button>(R.id.btn1)

        btn1.setOnClickListener({
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        })
    }
}