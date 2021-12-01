package com.example.adivinaquien

class CharService {
    var characterList: List<Character> = listOf(
        Character("Abigail", "Naranja", "Marron", arrayOf<String>("Gafas, Accesorio pelo"), arrayOf<String>("Clara")), // 1
        Character("Alexander", "Marron", "Azul", arrayOf<String>("Gorra"), arrayOf<String>("Clara", "Barba")), // 2
        Character("Anna", "Negro", "Verde", arrayOf<String>("Pendientes"), arrayOf<String>("Obscura")), // 3
        Character("Anthony", "Amarillo", "Marron", arrayOf<String>(), arrayOf<String>("Clara")), // 4
        Character("Benjamin", "Naranja", "Verde", arrayOf<String>(), arrayOf<String>("Clara")), // 5
        Character("Campbell", "Calvo", "Marron", arrayOf<String>("Gafas", "Pendientes"), arrayOf<String>("Clara")), // 6
        Character("Charles", "Calvo", "Azul", arrayOf<String>("Gorra"), arrayOf<String>("Clara", "Bigote")), // 7
        Character("David", "Calvo", "Verde", arrayOf<String>(), arrayOf<String>("Clara", "Barba")), // 8
        Character("Emma", "Naranja", "Verde", arrayOf<String>(), arrayOf<String>("Clara")), // 9
        Character("Ethan", "Amarillo", "Azul", arrayOf<String>("Gorra"), arrayOf<String>("Clara")), // 10
        Character("Jacob", "Marron", "Marron", arrayOf<String>(), arrayOf<String>("Obscura")), // 11
        Character("Jerry", "Negro", "Marron", arrayOf<String>("Gorra"), arrayOf<String>("Obscura")), // 12
        Character("Laura", "Naranja", "Verde", arrayOf<String>("Accesorio pelo", "Pendientes"), arrayOf<String>("Clara")), // 13
        Character("Linda", "Negro", "Azul", arrayOf<String>("Gafas", "Accesorio pelo"), arrayOf<String>("Clara")), // 14
        Character("Lisa", "Amarillo", "Azul", arrayOf<String>("Accesorio pelo"), arrayOf<String>("Clara")), // 15
        Character("Madison", "Marron", "Verde", arrayOf<String>(), arrayOf<String>("Clara")), // 16
        Character("Maria", "Amarillo", "Azul", arrayOf<String>("Accesorio pelo", "Gafas"), arrayOf<String>("Clara")), // 17
        Character("Martin", "Amarillo", "Azul", arrayOf<String>(), arrayOf<String>("Clara", "Barba")), // 18
        Character("Rachel", "Marron", "Verde", arrayOf<String>("Gorra"), arrayOf<String>("Obscura")), // 19
        Character("Richard", "Negro", "Verde", arrayOf<String>(), arrayOf<String>("Clara", "Barba")), // 20
        Character("Roy", "Marron", "Marron", arrayOf<String>("Gafas"), arrayOf<String>("Obscura")), // 21
        Character("Scott", "Marron", "Verde", arrayOf<String>(), arrayOf<String>("Obscura", "Bigote")), // 22
        Character("Sophia", "Marron", "Azul", arrayOf<String>("Accesorio pelo", "Pendientes"), arrayOf<String>("Clara")), // 23
        Character("Tiffany", "Negro", "Marron", arrayOf<String>("Accesorio pelo"), arrayOf<String>("Clara")), // 24
    )

    constructor() {
    }

    fun turn(property: String, value: String) {
        for (c in this.characterList) {
            when(property) {
                "pelos" -> this.checkPelos(value, c)
                "ojos" -> this.checkOjos(value, c)
                "accesorios" -> this.checkAccesorios(value, c)
                "otros" -> this.checkOtros(value, c)
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

    fun getRemoveArray(): MutableList<String> {
        var auxArray: MutableList<String> = ArrayList()

        for(c in this.characterList) {
            if(c.removed) {
                auxArray.add(c.nombre)
            }
        }
        return auxArray
    }

    private fun checkPelos(value: String, character: Character) {
        if (value != character.pelo) {
            character.removed = true
        }
    }

    private fun checkOjos(value: String, character: Character) {
        if (value != character.ojos) {
            character.removed = true
        }
    }

    private fun checkAccesorios(value: String, character: Character) {
        if (character.accesorios.indexOf(value) == -1) {
            character.removed = true
        }
    }

    private fun checkOtros(value: String, character: Character) {
        if (character.otros.indexOf(value) == -1) {
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

    var removed: Boolean = false;


    constructor(nombre: String, pelos: String, ojos: String, accesorios: Array<String>, otros: Array<String>) {
        this.nombre = nombre
        this.pelo = pelos
        this.ojos = ojos
        this.accesorios = accesorios
        this.otros = otros
    }
}