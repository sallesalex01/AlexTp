package com.example.alextp3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nome:TextView = findViewById(R.id.NomeNovaTela)
        val intent = intent
        val value = intent.getStringExtra("key")
        nome.text = value
    }
}