package com.example.afrodev_pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StatusPokemonActivity : AppCompatActivity() {
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
        val nextevolucao = findViewById<Button>(R.id.btn_evolucao)
        nextevolucao.setOnClickListener {
            proximaTelaEvolucao()
        }
    }
    private fun proximaTelaStatus() {
        val intent = Intent(this, StatusPokemonActivity::class.java)
        startActivity(intent)
    }
    private fun proximaTelaHabilidade() {
        val i = Intent(this, PokemonHabilidade::class.java)
        startActivity(i)
    }
    private fun proximaTelaEvolucao() {
        val inte = Intent(this, PokemonEvolucao::class.java)
        startActivity(inte)
    }
    }
