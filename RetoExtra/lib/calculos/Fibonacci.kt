package lib.calculos

public class Fibonacci(val n: Int) {var r=0;init {r=fib(n)}
    private fun fib(n: Int) : Int {
        if (n >= 2) {var num = fib(n-1) + fib(n-2);return num}
        return n
    }
}