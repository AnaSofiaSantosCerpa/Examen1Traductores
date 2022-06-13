package lib.programas

public class Execute(val p: Programa, val i: MutableList<Interprete>, val t: MutableList<Traductor>) {
    var local = "LOCAL"
    var nombre = p.nombre()
    var yes = "Sí, es posible ejecutar el programa '$nombre'"
    var no = "No es posible ejecutar el programa '$nombre'"
    var ejecutable = false

    init {
        if (p.l == "LOCAL") {
            println(yes)
        } else {
            var l1 = mutableListOf<Interprete>()
            var l2 = mutableListOf<Traductor>()

            i.forEach {it ->
                if (p.lenguaje() == it.lenguaje()) {
                    l1.add(it)
                }
            }
            t.forEach {it ->
                if (p.lenguaje() == it.lengorigen()) {
                    l2.add(it)
                }
            }
            ejecutable = verificar(p.lenguaje(),l1,l2,i,t)
            
            if (ejecutable) {
                println(yes)
            } else {
                println(no)
            }
        }
    }

    private fun verificar(l: String, lista1: MutableList<Interprete>, lista2: MutableList<Traductor>, i: MutableList<Interprete>, t: MutableList<Traductor>) : Boolean {
        var search1 = lista1.find {it.b == local}
        var search2 = lista2.find {it.b == local}
        var new1 = mutableListOf<Interprete>()
        var new2 = mutableListOf<Traductor>()

        if (search1 != null) {
            return true
        } else {
            lista1.forEach {it1 ->
                i.forEach {it2 ->
                    if (it1.lengbase() == it2.lenguaje()) {
                        new1.add(it2)
                    }
                }
                t.forEach {it2 ->
                    if (it1.lengbase() == it2.lengorigen()) {
                        new2.add(it2)
                    }
                }
                return verificar(it1.lenguaje(),new1,new2,i,t)
            }
        }

        if (search2 != null) {
            return true
        } else {
            lista2.forEach {it1 ->
                i.forEach {it2 ->
                    if (it1.lengbase() == it2.lenguaje()) {
                        new1.add(it2)
                    }
                }
                t.forEach {it2 ->
                    if (it1.lengbase() == it2.lengorigen()) {
                        new2.add(it2)
                    }
                }
                return verificar(it1.lengdestino(),new1,new2,i,t)
            }
        }
        
        return false
    }
}