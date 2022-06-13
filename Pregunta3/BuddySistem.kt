/*
CI-3641 Lenguajes de Programación I
Ana Santos 17-10602

                PARCIAL #1

Pregunta 3: Lenguaje escogido Kotlin
*/
import java.io.File
import java.util.*
import java.util.Scanner

fun main(args: Array<String>) {
    val bloques = args[0].toInt()
    var memoria = mutableListOf<Pair<String,Int>>(Pair("vacio",bloques))
    var nombres = mutableListOf<String>()
    var total = 0
    var salir = true
    
    while (salir) {
        print("ACCION> ")
        var accion = readLine()!!
        val sincomillas = accion.split(" ")
        var action = sincomillas[0]

        if (action == "RESERVAR") {
            var nombre = sincomillas[1]
            var cantidad = sincomillas[2].toInt()
            var par = Pair(nombre,cantidad)
            var espacio = Pair("string",0)

            if (nombres.contains(nombre)) {
                println("ERROR: $nombre ya tiene espacio de memoria reservado")
            } else if (total == bloques) {
                println("ERROR: No hay existen más bloques de memoria libre")
            } else if (cantidad > bloques) {
                println("ERROR: Cantidad de memoria solicitada mayor a la memoria total")
            } else {
                memoria.forEach {it ->
                    if ((it.first == "vacio") && (it.second < cantidad)) {
                        println("ERROR: No hay suficiente espacio libre contiguo")
                    } else if ((it.first == "vacio") && (it.second >= cantidad)) {
                        espacio = Pair("vacio",it.second)
                    }
                }
                
                if (espacio.first != "string") {
                    memoria.removeIf {it == espacio}
                    memoria.add(par)
                    nombres.add(nombre)
                    total += cantidad
                    if (espacio.second > cantidad) {
                        memoria.add(Pair("vacio",espacio.second-cantidad))
                    }
                }
            }
        }
        
        
        if (action == "LIBERAR") {
            var nombre = sincomillas[1]

            if (!nombres.contains(nombre)) {
                println("ERROR: $nombre no tiene memoria reservada")
            } else {
                nombres.removeIf {it == nombre}
                var espacio = memoria.find {it.first == nombre}
                memoria.removeIf {it == espacio}
                memoria.add(Pair("vacio",espacio!!.second))
                total -= espacio!!.second
            }
        }
        
        
        if (action == "MOSTRAR") {
            println("ESTADO ACTUAL DE LA MEMORIA")
            println("---------------------------------")
            var num = bloques - total
            

            println("Cantidad de Bloques de Memoria Libres: $num")
            memoria.forEach {it ->
                if (it.first == "vacio") {
                    num = it.second
                    println("Espacio de Bloques Contiguos Libres: $num")
                }
            }
            nombres.forEach {x ->
                var id = memoria.find {it.first == x}
                num = id!!.second
                println("Bloques de Memoria reservados para $x: $num")
            }
            println("---------------------------------")
        }
        
        if (action == "SALIR") {
            println("~~~")
            salir = false
        }
    }
}