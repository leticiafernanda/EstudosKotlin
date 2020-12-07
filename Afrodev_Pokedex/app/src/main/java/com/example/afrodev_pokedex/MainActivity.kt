package com.example.afrodev_pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<Button>(R.id.button_tela2)

        next.setOnClickListener {

               proximaTela()
            }
        }
    private fun proximaTela()
    {
        val intent = Intent(this, SplashCarregarActivity::class.java)
        startActivity(intent)
    }

}