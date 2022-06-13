package lib.calculos
import java.math.BigInteger
public class Bell(val n: Int) {var r=0;init {r=bn(n)}
    private fun bn(n: Int) : Int {
        if (n>0) {var suma=0;for (k in 0..n-1) {suma+=((fact(n-1))/(fact(k)*fact(n-1-k))).toInt()*bn(n-1)};return suma.toInt()} 
        return 1
    }
    fun fact(k: Int) : Int {
        if (k>0) {var f = BigInteger.ONE;for (i in 1..k) {f = f.times(BigInteger.valueOf(i.toLong()))};return f.toInt()}
        return 1
    }
}