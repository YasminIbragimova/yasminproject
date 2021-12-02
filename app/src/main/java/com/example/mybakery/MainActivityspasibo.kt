package com.example.mybakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityspasibo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityspasibo)

        val Button = findViewById<ImageView>(R.id.otz1)

        Button.setOnClickListener{
            startActivity(Intent(this,MainActivityotzivmy::class.java))
        }
    }
}