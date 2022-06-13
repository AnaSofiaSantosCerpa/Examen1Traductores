package lib.programas

public class Interprete(val base: String, val language: String) {
    var b = base
    var l = language

    init {
        println("Se definió un intérprete para '$language', ejecutable en '$base'")
    }

    fun lengbase() : String {
        return base
    }

    fun lenguaje() : String {
        return language
    }
}