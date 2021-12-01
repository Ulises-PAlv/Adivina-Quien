package com.example.adivinaquien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class inicioJuego : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_juego)
        //val txt: TextView = findViewById(R.id.texto)
        val Img1: ImageView = findViewById(R.id.tab0)
        val Img2: ImageView = findViewById(R.id.tab1)
        val Img3: ImageView = findViewById(R.id.tab2)
        val Img4: ImageView = findViewById(R.id.tab3)
        val Img5: ImageView = findViewById(R.id.tab4)
        val Img6: ImageView = findViewById(R.id.tab5)
        val Img7: ImageView = findViewById(R.id.tab6)
        val Img8: ImageView = findViewById(R.id.tab7)
        val Img9: ImageView = findViewById(R.id.tab8)
        val Img10: ImageView = findViewById(R.id.tab9)
        val Img11: ImageView = findViewById(R.id.tab10)
        val Img12: ImageView = findViewById(R.id.tab11)
        val Img13: ImageView = findViewById(R.id.tab12)
        val Img14: ImageView = findViewById(R.id.tab13)
        val Img15: ImageView = findViewById(R.id.tab14)
        val Img16: ImageView = findViewById(R.id.tab15)
        val Img17: ImageView = findViewById(R.id.tab16)
        val Img18: ImageView = findViewById(R.id.tab17)
        val Img19: ImageView = findViewById(R.id.tab18)
        val Img20: ImageView = findViewById(R.id.tab19)
        val Img21: ImageView = findViewById(R.id.tab20)
        val Img22: ImageView = findViewById(R.id.tab21)
        val Img23: ImageView = findViewById(R.id.tab22)
        val Img24: ImageView = findViewById(R.id.tab23)
        val txt: TextView = findViewById(R.id.pruba)
        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            actionBar?.hide()
        }

        var charPruba = CharService()
        charPruba.turn("pelos", "Marron")
        var arrayMoreno = charPruba.getRemoveArray()
        println(arrayMoreno)

        val personaje =intent.getStringExtra("Personaje")

        val pers = arrayOf("p_abigail","p_alexander","p_anna","p_anthony","p_benjamin","p_campbell","p_charles","p_david","p_emma","p_ethan","p_jacob","p_jerry","p_laura","p_linda","p_lisa","p_madison","p_maria","p_martin","p_rachel","p_richard","p_roy","p_scott","p_sophia","p_tiffany")
        val ready: ArrayList<Int> = ArrayList()
        for (i in 0..23){

            do{
                var flag = true
                var rand = (0..23).random()
                var xd  = ready.indexOf(rand)

                if(xd == -1){
                    ready.add(rand)
                }else{
                    flag = false
                }
            }while(flag == false)
        }

        var countDeck: Int = 0

        do {
            when(countDeck) {
                0 -> setImage(countDeck, ready, Img24)
                1 -> setImage(countDeck, ready, Img1)
                2 -> setImage(countDeck, ready, Img2)
                3 -> setImage(countDeck, ready, Img3)
                4 -> setImage(countDeck, ready, Img4)
                5 -> setImage(countDeck, ready, Img5)
                6 -> setImage(countDeck, ready, Img6)
                7 -> setImage(countDeck, ready, Img7)
                8 -> setImage(countDeck, ready, Img8)
                9 -> setImage(countDeck, ready, Img9)
                10 -> setImage(countDeck, ready, Img10)
                11 -> setImage(countDeck, ready, Img11)
                12 -> setImage(countDeck, ready, Img12)
                13 -> setImage(countDeck, ready, Img13)
                14 -> setImage(countDeck, ready, Img14)
                15 -> setImage(countDeck, ready, Img15)
                16 -> setImage(countDeck, ready, Img16)
                17 -> setImage(countDeck, ready, Img17)
                18 -> setImage(countDeck, ready, Img18)
                19 -> setImage(countDeck, ready, Img19)
                20 -> setImage(countDeck, ready, Img20)
                21 -> setImage(countDeck, ready, Img21)
                22 -> setImage(countDeck, ready, Img22)
                23 -> setImage(countDeck, ready, Img23)
            }
            countDeck++
        } while(countDeck < 24)

    }

    private fun setImage(x: Int, ready: ArrayList<Int>, Img: ImageView) {
        when(ready.get(x)){
            0 -> Img.setImageResource(R.drawable.p_tiffany)
            1 -> Img.setImageResource(R.drawable.p_abigail)
            2 -> Img.setImageResource(R.drawable.p_alexander)
            3 -> Img.setImageResource(R.drawable.p_anna)
            4 -> Img.setImageResource(R.drawable.p_anthony)
            5 -> Img.setImageResource(R.drawable.p_benjamin)
            6 -> Img.setImageResource(R.drawable.p_campbell)
            7 -> Img.setImageResource(R.drawable.p_charles)
            8 -> Img.setImageResource(R.drawable.p_david)
            9 -> Img.setImageResource(R.drawable.p_emma)
            10 -> Img.setImageResource(R.drawable.p_ethan)
            11 -> Img.setImageResource(R.drawable.p_jacob)
            12 -> Img.setImageResource(R.drawable.p_jerry)
            13 -> Img.setImageResource(R.drawable.p_laura)
            14 -> Img.setImageResource(R.drawable.p_linda)
            15 -> Img.setImageResource(R.drawable.p_lisa)
            16 -> Img.setImageResource(R.drawable.p_madison)
            17 -> Img.setImageResource(R.drawable.p_maria)
            18 -> Img.setImageResource(R.drawable.p_martin)
            19 -> Img.setImageResource(R.drawable.p_rachel)
            20 -> Img.setImageResource(R.drawable.p_richard)
            21 -> Img.setImageResource(R.drawable.p_roy)
            22 -> Img.setImageResource(R.drawable.p_scott)
            23 -> Img.setImageResource(R.drawable.p_sophia)
        }
    }
}