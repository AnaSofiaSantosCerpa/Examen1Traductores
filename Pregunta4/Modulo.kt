/*
CI-3641 Lenguajes de Programación I
Ana Santos 17-10602

                PARCIAL #1

Pregunta 4: Lenguaje escogido Kotlin
*/
import java.io.File
import java.util.*
import java.util.Scanner
import lib.operaciones.*



fun main(args: Array<String>) {
    var a = Cuaternion(0.0,1.0,1.0,1.0)
    var b = Cuaternion(7.0,1.0,2.0,3.0)
    var c = Cuaternion(8.0,-1.0,1.0,-2.0)
    var op = b
    println("Equivalencias de operadores:")
    println("--------------------------------")
    println("Suma ==> +")
    println("Producto ==> *")
    println("Conjugada ==> -")
    println("Promedio ==> !")
    println("--------------------------------\n")

    println("Operaciones Parte (b):\n")
    op = b + c
    println("b + c = $op")
    op = a * b + c
    println("a * b + c = $op")
    op = (b + b) * (c + -a)
    println("(b + b) * (c + -a) = $op")
    var op1 = !(c * b)
    println("!(c * b) = $op1\n")

    println("Operaciones Parte (c):\n")
    op = b + b
    println("b + 3 = $op")
    op = a * 3.0 + 7.0
    println("a * 3.0 + 7.0 = $op")
    op = (b + b) * !c
    println("(b + b) * !c = $op\n") 

}