package com.example.mybakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivitysearch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitysearch)


        val Button = findViewById<ImageView>(R.id.buy)

        Button.setOnClickListener{
            startActivity(Intent(this,MainActivitypaypage::class.java))
        }
    }
}