package lib.programas

public class Traductor(val base: String, val origen: String, val destino: String) {
    var b = base
    var o = origen
    var d = destino

    init {
        println("Se definió un traductor de '$origen' hacia '$destino', escrito en '$base'")
    }

    fun lengbase() : String {
        return base
    }

    fun lengorigen() : String {
        return origen
    }

    fun lengdestino() : String {
        return destino
    }
}