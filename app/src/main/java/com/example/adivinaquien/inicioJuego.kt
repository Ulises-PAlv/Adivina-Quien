package com.example.adivinaquien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.github.clans.fab.FloatingActionButton

class inicioJuego : AppCompatActivity() {
    private lateinit var Img0: ImageView
    private lateinit var Img1: ImageView
    private lateinit var Img2: ImageView
    private lateinit var Img3: ImageView
    private lateinit var Img4: ImageView
    private lateinit var Img5: ImageView
    private lateinit var Img6: ImageView
    private lateinit var Img7: ImageView
    private lateinit var Img8: ImageView
    private lateinit var Img9: ImageView
    private lateinit var Img10: ImageView
    private lateinit var Img11: ImageView
    private lateinit var Img12: ImageView
    private lateinit var Img13: ImageView
    private lateinit var Img15: ImageView
    private lateinit var Img14: ImageView
    private lateinit var Img16: ImageView
    private lateinit var Img17: ImageView
    private lateinit var Img18: ImageView
    private lateinit var Img19: ImageView
    private lateinit var Img20: ImageView
    private lateinit var Img21: ImageView
    private lateinit var Img22: ImageView
    private lateinit var Img23: ImageView

    private val TURNOS: Int = 7
    var countTurnos: Int = 1

    val ready: ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_juego)

        Img0 = findViewById(R.id.tab0)
        Img1 = findViewById(R.id.tab1)
        Img2 = findViewById(R.id.tab2)
        Img3 = findViewById(R.id.tab3)
        Img4 = findViewById(R.id.tab4)
        Img5 = findViewById(R.id.tab5)
        Img6 = findViewById(R.id.tab6)
        Img7 = findViewById(R.id.tab7)
        Img8 = findViewById(R.id.tab8)
        Img9 = findViewById(R.id.tab9)
        Img10 = findViewById(R.id.tab10)
        Img11 = findViewById(R.id.tab11)
        Img12 = findViewById(R.id.tab12)
        Img13 = findViewById(R.id.tab13)
        Img14 = findViewById(R.id.tab14)
        Img15 = findViewById(R.id.tab15)
        Img16 = findViewById(R.id.tab16)
        Img17 = findViewById(R.id.tab17)
        Img18 = findViewById(R.id.tab18)
        Img19 = findViewById(R.id.tab19)
        Img20 = findViewById(R.id.tab20)
        Img21 = findViewById(R.id.tab21)
        Img22 = findViewById(R.id.tab22)
        Img23 = findViewById(R.id.tab23)

        val winner: EditText = findViewById(R.id.inputWinner)
        val btnGanador: Button = findViewById(R.id.btnGanador)

        val personaje =intent.getStringExtra("Personaje")
        var deck = CharService()

        if (personaje != null) {
            deck.setSinglePlayerCharacter(personaje)
        }

        val btnCabelloMarron: FloatingActionButton =findViewById(R.id.btnCabelloMarron)
        val btnCabelloNegro: FloatingActionButton =findViewById(R.id.btnCabelloNegro)
        val btnCabelloAmarillo: FloatingActionButton =findViewById(R.id.btnCabelloAmarillo)
        val btnCabelloNaranja: FloatingActionButton =findViewById(R.id.btnCabelloNaranja)
        val btnCabelloCalvo: FloatingActionButton =findViewById(R.id.btnCabelloCalvo)

        val btnOjosMarron: FloatingActionButton =findViewById(R.id.btnOjosMarron)
        val btnOjosVerde: FloatingActionButton =findViewById(R.id.btnOjosVerde)
        val btnOjosAzul: FloatingActionButton =findViewById(R.id.btnOjosAzul)

        val btnAccesoriosGafas: FloatingActionButton =findViewById(R.id.btnAccGafas)
        val btnAccesoriosPendientes: FloatingActionButton =findViewById(R.id.btnAccPendientes)
        val btnAccesoriosCabello: FloatingActionButton =findViewById(R.id.btnAccPelo)
        val btnAccesoriosGorra: FloatingActionButton =findViewById(R.id.btnAccGorra)

        val btnOtherBarba: FloatingActionButton =findViewById(R.id.btnOtherBarba)
        val btnOtherBigote: FloatingActionButton =findViewById(R.id.btnOtherBigote)
        val btnOtherMorena: FloatingActionButton =findViewById(R.id.btnOtherPielMorena)
        val btnOtherClara: FloatingActionButton =findViewById(R.id.btnOtherPielClara)

        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            actionBar?.hide()
        }

        var Puntaje = Puntaje()

        this.getCharactersPosition()

        //----------------------
        btnGanador.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()

            if (winner.text.toString() == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }
        /*
        Img0.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()

            if("Tiffany" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img1.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Abigail" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img2.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Alexander" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img3.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Anna" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img4.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Anthony" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img5.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Benjamin" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img6.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Campbell" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img7.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Charles" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img8.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("David" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img9.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Emma" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img10.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Ethan" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img11.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Jacob" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img12.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Jerry" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img13.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Laura" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img14.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Linda" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img15.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Lisa" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img16.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Madison" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img17.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Maria" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img18.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Martin" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img19.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Rachel" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img20.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Richard" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }
        Img21.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Roy" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img22.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()
            if("Scott" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }

        Img23.setOnClickListener() {
            var arrayReady =deck.getRemoveArray()

            if("Sophia" == personaje) {
                this.winner(arrayReady)
            } else {
                this.mamo(arrayReady)
            }
        }
        */

        btnCabelloMarron.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("pelos", "Marron")
                var arrayReady = deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnCabelloNegro.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("pelos", "Negro")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnCabelloAmarillo.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("pelos", "Amarillo")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnCabelloNaranja.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("pelos", "Naranja")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnCabelloCalvo.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("pelos", "Calvo")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnOjosMarron.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("ojos", "Marron")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }

        }
        btnOjosVerde.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("ojos", "Verde")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnOjosAzul.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("ojos", "Azul")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnAccesoriosGafas.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("accesorios", "Gafas")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnAccesoriosCabello.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("accesorios", "Accesorio pelo")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnAccesoriosPendientes.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("accesorios", "Pendientes")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnAccesoriosGorra.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("accesorios", "Gorra")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnOtherBarba.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("otros", "Barba")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnOtherBigote.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("otros", "Bigote")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnOtherMorena.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("otros", "Obscura")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos =Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
        btnOtherClara.setOnClickListener {
            if(this.countTurnos < this.TURNOS) {
                deck.turn("otros", "Clara")
                var arrayReady =deck.getRemoveArray()
                removeCharacters(arrayReady)
                countTurnos++
            } else {
                var arrayReady =deck.getRemoveArray()
                Puntaje.setValues(countTurnos, arrayReady.size)
                val totalPuntos = Puntaje.getPuntaje()
                println("xxx> " + totalPuntos)
            }
        }
    }

    private fun winner(array: MutableList<Int>) {
        var Puntaje = Puntaje()
        println("Ganaste chepe")
        Puntaje.setValues(countTurnos, array.size)
        val totalPuntos = Puntaje.getPuntaje()
        println("xxx> " + totalPuntos)
    }

    private fun mamo(array: MutableList<Int>) {
        var Puntaje = Puntaje()
        println("No ganaste chepe")
        Puntaje.setValues(countTurnos, array.size)
        val totalPuntos = Puntaje.getPuntaje()
        println("xxx> " + totalPuntos)
    }

    private fun getCharactersPosition() {
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
                0 -> setImage(countDeck, ready, Img0)
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

    private fun removeCharacters(removed: MutableList<Int>) {
        println(removed)
        var countRemoved = 0
        do {
            var auxPosition = ready.indexOf(removed[countRemoved])
            println(auxPosition)

            when(auxPosition) {
                0 -> Img0.setImageResource(R.drawable.bkg)
                1 -> Img1.setImageResource(R.drawable.bkg)
                2 -> Img2.setImageResource(R.drawable.bkg)
                3 -> Img3.setImageResource(R.drawable.bkg)
                4 -> Img4.setImageResource(R.drawable.bkg)
                5 -> Img5.setImageResource(R.drawable.bkg)
                6 -> Img6.setImageResource(R.drawable.bkg)
                7 -> Img7.setImageResource(R.drawable.bkg)
                8 -> Img8.setImageResource(R.drawable.bkg)
                9 -> Img9.setImageResource(R.drawable.bkg)
                10 -> Img10.setImageResource(R.drawable.bkg)
                11 -> Img11.setImageResource(R.drawable.bkg)
                12 -> Img12.setImageResource(R.drawable.bkg)
                13 -> Img13.setImageResource(R.drawable.bkg)
                14 -> Img14.setImageResource(R.drawable.bkg)
                15 -> Img15.setImageResource(R.drawable.bkg)
                16 -> Img16.setImageResource(R.drawable.bkg)
                17 -> Img17.setImageResource(R.drawable.bkg)
                18 -> Img18.setImageResource(R.drawable.bkg)
                19 -> Img19.setImageResource(R.drawable.bkg)
                20 -> Img20.setImageResource(R.drawable.bkg)
                21 -> Img21.setImageResource(R.drawable.bkg)
                22 -> Img22.setImageResource(R.drawable.bkg)
                23 -> Img23.setImageResource(R.drawable.bkg)
            }
            countRemoved++
        } while (countRemoved < removed.size)
    }
}