/*
CI-3641 Lenguajes de Programación I
Ana Santos 17-10602

                PARCIAL #1

Pregunta 5: Lenguaje escogido Kotlin
*/
import java.io.File
import java.util.*
import java.util.Scanner
import lib.programas.*

fun main(args: Array<String>) {
    var programas = mutableListOf<Programa>()
    var interpretes = mutableListOf<Interprete>()
    var traductores = mutableListOf<Traductor>()
    var salir = true
    var local = "LOCAL"

    while (salir) {
        print("ACCION> ")
        var accion = readLine()!!
        val sincomillas = accion.split(" ")
        var action = sincomillas[0]

        if (action == "DEFINIR") {
            var tipo = sincomillas[1]

            if (tipo == "PROGRAMA") {
                programas.add(Programa(sincomillas[2],sincomillas[3]))
            } else if (tipo == "INTERPRETE") {
                interpretes.add(Interprete(sincomillas[2],sincomillas[3]))
            } else if (tipo == "TRADUCTOR") {
                traductores.add(Traductor(sincomillas[2],sincomillas[3],sincomillas[4]))
            }                
        }

        if (action == "EJECUTABLE") {
            var nombre = sincomillas[1] 
            var buscar = programas.find {it.n == nombre}
             
            if (buscar == null) {
                println("ERROR: '$nombre' no tiene un programa asociado")
            } else {
                Execute(buscar,interpretes,traductores)
            }
        }
        
        if (action == "SALIR") {
            println("~~~")
            salir = false
        }
    }
}