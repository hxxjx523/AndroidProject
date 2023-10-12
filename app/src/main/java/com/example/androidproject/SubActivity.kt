package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val Temperature_choice = findViewById<Button>(R.id.Temperature_choice)

        Temperature_choice.setOnClickListener({
            val intent = Intent(this, Clothes::class.java)
            startActivity(intent)
        })
    }
}