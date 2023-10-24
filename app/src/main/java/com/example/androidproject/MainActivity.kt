package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//api 주소
//api.openweathermap.org/data/2.5/weather?q=Seoul&APPID=251e5cc85b8c6c4647faef33bb035b1b
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