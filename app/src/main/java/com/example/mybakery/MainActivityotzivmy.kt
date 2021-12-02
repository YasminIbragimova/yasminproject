package com.example.mybakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityotzivmy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityotzivmy)

        val Button = findViewById<ImageView>(R.id.posmotz)

        Button.setOnClickListener{
            startActivity(Intent(this,MainActivityotzivy::class.java))
        }
    }
}