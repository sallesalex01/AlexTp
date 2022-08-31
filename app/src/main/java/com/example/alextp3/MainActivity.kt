package com.example.alextp3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun proximaTela(view: View){
        val nome: EditText = findViewById(R.id.nomePessoaTxt)
        val myIntent = Intent(this, MainActivity2::class.java)
        myIntent.putExtra("key", nome.text.toString()) //Optional parameters

        this.startActivity(myIntent)
    }

}