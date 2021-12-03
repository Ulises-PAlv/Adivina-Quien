package com.example.adivinaquien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class GameSingle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_single)

        val btnContin: Button = findViewById(R.id.btnEmpezar)
        val rnds = (1..24).random()

        val i = Intent(this, inicioJuego::class.java)

        when(rnds){
            1 -> i.putExtra("Personaje", "Abigail")
            2 -> i.putExtra("Personaje", "Alexander")
            3 -> i.putExtra("Personaje", "Anna")
            4 -> i.putExtra("Personaje", "Anthony")
            5 -> i.putExtra("Personaje", "Benjamin")
            6 -> i.putExtra("Personaje", "Campbell")
            7 -> i.putExtra("Personaje", "Charles")
            8 -> i.putExtra("Personaje", "David")
            9 -> i.putExtra("Personaje", "Emma")
            10 -> i.putExtra("Personaje", "Ethan")
            11 -> i.putExtra("Personaje", "Jacob")
            12 -> i.putExtra("Personaje", "Jerry")
            13 -> i.putExtra("Personaje", "Laura")
            14 -> i.putExtra("Personaje", "Linda")
            15 -> i.putExtra("Personaje", "Lisa")
            16 -> i.putExtra("Personaje", "Madison")
            17 -> i.putExtra("Personaje", "Maria")
            18 -> i.putExtra("Personaje", "Martin")
            19 -> i.putExtra("Personaje", "Rachel")
            20 -> i.putExtra("Personaje", "Richard")
            21 -> i.putExtra("Personaje", "Roy")
            22 -> i.putExtra("Personaje", "Scott")
            23 -> i.putExtra("Personaje", "Sophia")
            24 -> i.putExtra("Personaje", "Tiffany")

        }

        btnContin.setOnClickListener(){
            startActivity(Intent(i))
        }
    }
}