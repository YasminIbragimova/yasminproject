package com.example.mybakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivitypaypage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitypaypage)

        val Button = findViewById<ImageView>(R.id.pay)

        Button.setOnClickListener{
            startActivity(Intent(this,MainActivityoplata::class.java))
        }
    }
}