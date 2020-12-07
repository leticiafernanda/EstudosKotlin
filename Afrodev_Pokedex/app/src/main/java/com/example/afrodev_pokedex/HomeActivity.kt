package com.example.afrodev_pokedex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val nextDashboard = findViewById<Button>(R.id.chip10_tela2)

        nextDashboard.setOnClickListener {

            proximaTelaDashboard()
        }
    }
    private fun proximaTelaDashboard()
    {
        val intent = Intent(this, PokemonActivity::class.java)
        startActivity(intent)
    }

}