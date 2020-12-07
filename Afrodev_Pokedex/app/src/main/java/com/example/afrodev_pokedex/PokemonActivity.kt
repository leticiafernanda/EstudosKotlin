package com.example.afrodev_pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PokemonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_dashboard)

        val nextstatus = findViewById<Button>(R.id.btn_status)
        nextstatus.setOnClickListener {
            proximaTelaStatus()
        }
        val nexthabilidade = findViewById<Button>(R.id.btn_habilidades)
        nexthabilidade.setOnClickListener {
            proximaTelaHabilidade()
        }
        val nextevolucao = findViewById<Button>(R.id.btn_habilidades)
        nextevolucao.setOnClickListener {
            proximaTelaEvolucao()
        }
    }
    private fun proximaTelaStatus() {
        val intent = Intent(this, StatusPokemonActivity::class.java)
        startActivity(intent)
    }
    private fun proximaTelaHabilidade() {
        val intent = Intent(this, PokemonHabilidade::class.java)
        startActivity(intent)
    }
    private fun proximaTelaEvolucao() {
        val intent = Intent(this, PokemonEvolucao::class.java)
        startActivity(intent)
    }


}


