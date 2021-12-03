package com.example.adivinaquien

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mediaplayer: MediaPlayer? = MediaPlayer.create(this, R.raw.papu )
        mediaplayer?.start()
        val btnJugar: Button = findViewById(R.id.boton_Jugar)
        val btnStats: Button = findViewById(R.id.stats)

        btnJugar.setOnClickListener {
            startActivity(Intent(this, tipoJuego::class.java))
        }

        btnStats.setOnClickListener{
            //startActivity(Intent(this, activityStats::class.java))
        }
    }
} 