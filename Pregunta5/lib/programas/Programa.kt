package lib.programas

public class Programa(val name: String, val language: String) {
    var n = name
    var l = language

    init {
        println("Se definió el programa '$name', ejecutable en '$language'")
    }

    fun nombre() : String {
        return name
    }

    fun lenguaje() : String {
        return language
    }
}