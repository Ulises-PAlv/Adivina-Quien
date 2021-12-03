package com.example.adivinaquien

class CharService {
    // ### PROPIEDADES ###
    var singlePlayerCharacter: Character = Character("", "", "", arrayOf<String>(), arrayOf<String>(), 0)

    var propertyCount: Array<Int> = arrayOf(5, 3, 4, 4)

    val propertyPelos: Array<String> = arrayOf("Negro", "Amarillo", "Marron", "Naranja", "Calvo")
    val propertyOjos: Array<String> = arrayOf("Marron", "Azul", "Verde")
    val propertyAccesorios: Array<String> = arrayOf("Gafas", "Pendientes", "Accesorio pelo", "Gorra")
    val propertyOtros: Array<String> = arrayOf("Clara", "Obscura", "Barba", "Bigote")

    var characterList: List<Character> = listOf(
        Character("Abigail", "Naranja", "Marron", arrayOf<String>("Accesorio pelo", "Gafas"), arrayOf<String>("Clara"), 1), // 1
        Character("Alexander", "Marron", "Azul", arrayOf<String>("Gorra"), arrayOf<String>("Clara", "Barba"), 2), // 2
        Character("Anna", "Negro", "Verde", arrayOf<String>("Pendientes"), arrayOf<String>("Obscura"), 3), // 3
        Character("Anthony", "Amarillo", "Marron", arrayOf<String>(), arrayOf<String>("Clara"), 4), // 4
        Character("Benjamin", "Naranja", "Verde", arrayOf<String>(), arrayOf<String>("Clara"), 5), // 5
        Character("Campbell", "Calvo", "Marron", arrayOf<String>("Gafas", "Pendientes"), arrayOf<String>("Clara"), 6), // 6
        Character("Charles", "Calvo", "Azul", arrayOf<String>("Gorra"), arrayOf<String>("Clara", "Bigote"), 7), // 7
        Character("David", "Calvo", "Verde", arrayOf<String>(), arrayOf<String>("Clara", "Barba"), 8), // 8
        Character("Emma", "Naranja", "Verde", arrayOf<String>(), arrayOf<String>("Clara"), 9), // 9
        Character("Ethan", "Amarillo", "Azul", arrayOf<String>("Gorra"), arrayOf<String>("Clara"), 10), // 10
        Character("Jacob", "Marron", "Marron", arrayOf<String>(), arrayOf<String>("Obscura"), 11), // 11
        Character("Jerry", "Negro", "Marron", arrayOf<String>("Gorra"), arrayOf<String>("Obscura"), 12), // 12
        Character("Laura", "Naranja", "Verde", arrayOf<String>("Accesorio pelo", "Pendientes"), arrayOf<String>("Clara"), 13), // 13
        Character("Linda", "Negro", "Azul", arrayOf<String>("Gafas", "Accesorio pelo"), arrayOf<String>("Clara"),14), // 14
        Character("Lisa", "Amarillo", "Azul", arrayOf<String>("Accesorio pelo"), arrayOf<String>("Clara"), 15), // 15
        Character("Madison", "Marron", "Verde", arrayOf<String>(), arrayOf<String>("Clara"), 16), // 16
        Character("Maria", "Amarillo", "Azul", arrayOf<String>("Accesorio pelo", "Gafas"), arrayOf<String>("Clara"),17), // 17
        Character("Martin", "Amarillo", "Azul", arrayOf<String>(), arrayOf<String>("Clara", "Barba"),18), // 18
        Character("Rachel", "Marron", "Verde", arrayOf<String>("Gorra"), arrayOf<String>("Obscura"),19), // 19
        Character("Richard", "Negro", "Verde", arrayOf<String>(), arrayOf<String>("Clara", "Barba"),20), // 20
        Character("Roy", "Negro", "Marron", arrayOf<String>("Gafas"), arrayOf<String>("Obscura"),21), // 21
        Character("Scott", "Negro", "Verde", arrayOf<String>(), arrayOf<String>("Obscura", "Bigote"),22), // 22
        Character("Sophia", "Marron", "Azul", arrayOf<String>("Accesorio pelo", "Pendientes"), arrayOf<String>("Clara"),23), // 23
        Character("Tiffany", "Negro", "Marron", arrayOf<String>("Accesorio pelo"), arrayOf<String>("Clara"),0), // 0
    )

    // ## CONSTRUCTOR ###
    constructor() { }

    //## METODOS ###
    fun setSinglePlayerCharacter(character: String) {
        for (c in this.characterList) {
            if (c.nombre == character) {
                this.singlePlayerCharacter = c
                println("Personaje random: " + this.singlePlayerCharacter.nombre)
            }
        }
    }

    fun compareVS_Character(property: String, value: String): Boolean {
        println("Comparanding: " + property + " xdd " + value)

        when (property) {
            "pelos" -> {
                println(this.singlePlayerCharacter.pelo)
                if (value == this.singlePlayerCharacter.pelo) {
                    return true
                } else {
                    return false
                }
            }
            "ojos" -> {
                if (value == this.singlePlayerCharacter.ojos) {
                    return true
                } else {
                    return false
                }
            }
            "accesorios" -> {
                if (this.singlePlayerCharacter.accesorios.indexOf(value) != -1) {
                    return true
                } else {
                    return false
                }
            }
            "otros" -> {
                if (this.singlePlayerCharacter.otros.indexOf(value) != -1) {
                    return true
                } else {
                    return false
                }
            }
        }
        return false
    }

    fun turn(property: String, value: String) {
        var boolCompare = this.compareVS_Character(property, value)

        if (boolCompare) {
            when(property) {
                "pelos" -> {
                    var arrayValues: MutableList<String> = ArrayList()
                    for (i in 0..this.propertyCount[0] - 1) {
                        if (value != propertyPelos[i]) {
                            arrayValues.add(propertyPelos[i])
                        }
                    }
                    this.repeater(arrayValues, property, "")
                }
                "ojos" -> {
                    var arrayValues: MutableList<String> = ArrayList()
                    for (i in 0..this.propertyCount[1] - 1) {
                        if (value != propertyOjos[i]) {
                            arrayValues.add(propertyOjos[i])
                        }
                    }
                    this.repeater(arrayValues, property, "")
                }
                "accesorios" -> {
                    var arrayValues: MutableList<String> = ArrayList()
                    for (i in 0..this.propertyCount[2] - 1) {
                        if (value != propertyAccesorios[i]) {
                            arrayValues.add(propertyAccesorios[i])
                        }
                    }
                    this.repeater(arrayValues, property, value)
                }
                "otros" -> {
                    var arrayValues: MutableList<String> = ArrayList()
                    for (i in 0..this.propertyCount[3] - 1) {
                        if (value != propertyOtros[i]) {
                            arrayValues.add(propertyOtros[i])
                        }
                    }
                    this.repeater(arrayValues, property, value)
                }
            }
        } else {
            for (c in this.characterList) {
                if (!c.removed) {
                    when (property) {
                        "pelos" -> this.checkPelos(value, c)
                        "ojos" -> this.checkOjos(value, c)
                        "accesorios" -> this.checkAccesorios(value, c)
                        "otros" -> this.checkOtros(value, c)
                    }
                }
            }
        }
    }

    private fun repeater(arrayValues: MutableList<String>, property: String, originalValue: String) {
        println("property: " + property)
        println("arrayValues: " + arrayValues)


        for(value in arrayValues) {
            for (c in this.characterList) {
                if (!c.removed) {
                    when (property) {
                        "pelos" -> if (c.pelo == value) { c.removed = true }
                        "ojos" -> if (c.ojos == value) { c.removed = true }
                        "accesorios" -> {
                            if (c.accesorios.indexOf(originalValue) == -1) {
                                if (c.accesorios.indexOf(value) != -1 || c.accesorios.size == 0) {
                                    c.removed = true
                                }
                            }
                        }
                        "otros" -> {
                            if (c.otros.indexOf(originalValue) == -1) {
                                if (c.otros.indexOf(value) != -1 || c.otros == null) {
                                    c.removed = true
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    fun testShowRemove() {
        for(c in this.characterList) {
            if(c.removed) {
                println(c.nombre)
            }
        }
    }

    fun getRemoveArray(): MutableList<Int> {
        var auxArray: MutableList<Int> = ArrayList()

        for(c in this.characterList) {
            if(c.removed) {
                auxArray.add(c.numero)
            }
        }
        return auxArray
    }

    private fun checkPelos(value: String, character: Character) {
        if (value == character.pelo) {
            character.removed = true
        }
    }

    private fun checkOjos(value: String, character: Character) {
        if (value == character.ojos) {
            character.removed = true
        }
    }

    private fun checkAccesorios(value: String, character: Character) {
        if (character.accesorios.indexOf(value) != -1) {
            character.removed = true
        }
    }

    private fun checkOtros(value: String, character: Character) {
        if (character.otros.indexOf(value) != -1) {
            character.removed = true
        }
    }
}

class Character {

    var nombre: String = ""
    var pelo: String = ""
    var ojos: String = ""
    var accesorios = arrayOf<String>()
    var otros = arrayOf<String>()
    var numero: Int = 0

    var removed: Boolean = false;


    constructor(nombre: String, pelos: String, ojos: String, accesorios: Array<String>, otros: Array<String>, numero: Int) {
        this.nombre = nombre
        this.pelo = pelos
        this.ojos = ojos
        this.accesorios = accesorios
        this.otros = otros
        this.numero = numero
    }
}

class Puntaje {
    private val BONUS_TURNO: Int = 150
    private val PENALIZACION: Int = 15

    private var penalizar: Int = 0
    private var turnos: Int = 0
    public var puntajeTotal: Int = 0

    constructor() { }

    private fun calcular() {
        this.puntajeTotal = 1000
        this.puntajeTotal += (this.turnos * BONUS_TURNO) - (this.penalizar * PENALIZACION)
    }

    public fun setValues(countTurnos: Int, countRemoved: Int) {
        this.penalizar = countRemoved
        this.turnos = countTurnos

        this.calcular()
    }

    public fun getPuntaje(): Int { return this.puntajeTotal }
}