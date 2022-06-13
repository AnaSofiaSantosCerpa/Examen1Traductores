import lib.calculos.*
import kotlin.math.*
fun jaweno(n: Int) : Int {return Fibonacci((floor((log2(Bell(n+1).r.toFloat())).toDouble()) + 1.0).toInt()).r}
fun main(args: Array<String>) {var a=jaweno(args[0].toInt());println("R:$a")    
}