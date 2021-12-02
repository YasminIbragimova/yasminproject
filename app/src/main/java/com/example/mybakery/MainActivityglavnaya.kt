package com.example.mybakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityglavnaya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityglavnaya)

        val textView = findViewById<ImageView>(R.id.imageView5)

        textView.setOnClickListener{
            startActivity(Intent(this,MainActivitysearch::class.java))
        }
    }
}