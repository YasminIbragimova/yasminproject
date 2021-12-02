package com.example.mybakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityoplata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityoplata)

        val imageView = findViewById<ImageView>(R.id.imageView14)

        imageView.setOnClickListener{
            startActivity(Intent(this,MainActivityozidaite::class.java))
        }
        val button = findViewById<ImageView>(R.id.imageView15)

        button.setOnClickListener{
            startActivity(Intent(this,MainActivityspasibo::class.java))
        }
        val perehod = findViewById<ImageView>(R.id.otmena)

        perehod.setOnClickListener{
            startActivity(Intent(this,MainActivitypaypage::class.java))
        }
    }
}