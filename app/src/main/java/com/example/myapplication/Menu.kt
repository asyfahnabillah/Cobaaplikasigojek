package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val tombolgojek : Button = findViewById(R.id.tombolgojek)
        val tombolshopee : Button = findViewById(R.id.tombolshopee)


        tombolgojek.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        tombolshopee.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}