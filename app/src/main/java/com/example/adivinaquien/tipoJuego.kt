package com.example.adivinaquien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tipoJuego : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_juego)

        val btnSingle: Button = findViewById(R.id.Single_game)
        val btnMulti: Button = findViewById(R.id.Multi_game)

        btnSingle.setOnClickListener {
            startActivity(Intent(this, GameSingle::class.java))
        }

        btnMulti.setOnClickListener{
            //startActivity(Intent(this, GameMulti::class.java))

        }
    }
}

