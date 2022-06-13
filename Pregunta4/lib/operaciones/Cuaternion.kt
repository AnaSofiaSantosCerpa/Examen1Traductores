package lib.operaciones
import kotlin.math.*
import kotlin.reflect.KClass

data class Cuaternion(val a: Double, val b: Double, val c: Double, val d: Double) {
    var cuat = arrayListOf(a,b,c,d)

    operator fun <T>plus(other: T) : Cuaternion {
        if (other is Double) {
            var a1 = this.cuat[0] + other

            return Cuaternion(a1,this.cuat[1],this.cuat[2],this.cuat[3])
        } else if (other is Int) {
            var a1 = this.cuat[0] + other.toDouble()

            return Cuaternion(a1,this.cuat[1],this.cuat[2],this.cuat[3])            
        } else if (other is Cuaternion) {
            var a1 = this.cuat[0] + other.cuat[0]
            var b1 = this.cuat[1] + other.cuat[1]       
            var c1 = this.cuat[2] + other.cuat[2]
            var d1 = this.cuat[3] + other.cuat[3]

            return Cuaternion(a1,b1,c1,d1)
        }
        return Cuaternion(0.0,0.0,0.0,0.0)
    }

    operator fun <T>times(other: T) : Cuaternion {
        var a1 = this.cuat[0]
        var b1 = this.cuat[1]
        var c1 = this.cuat[2]
        var d1 = this.cuat[3]
        
        if (other is Double) {
            var a2 = other
            var b2 = 0.0
            var c2 = 0.0
            var d2 = 0.0

            var p1 = (a1*a2-b1*b2-c1*c2-d1*d2)
            var p2 = (a1*b2+b1*a2+c1*d2-d1*c2)
            var p3 = (a1*c2-b1*d2+c1*a2+d1*b2)
            var p4 = (a1*d2+b1*c2-c1*b2+d1*a2)

            return Cuaternion(p1,p2,p3,p4)
        } else if (other is Int) {
            var a2 = other.toDouble()
            var b2 = 0.0
            var c2 = 0.0
            var d2 = 0.0

            var p1 = (a1*a2-b1*b2-c1*c2-d1*d2)
            var p2 = (a1*b2+b1*a2+c1*d2-d1*c2)
            var p3 = (a1*c2-b1*d2+c1*a2+d1*b2)
            var p4 = (a1*d2+b1*c2-c1*b2+d1*a2)

            return Cuaternion(p1,p2,p3,p4)
        } else if (other is Cuaternion) {
            
            var a2 = other.cuat[0]
            var b2 = other.cuat[1]
            var c2 = other.cuat[2]
            var d2 = other.cuat[3]

            var p1 = (a1*a2-b1*b2-c1*c2-d1*d2)
            var p2 = (a1*b2+b1*a2+c1*d2-d1*c2)
            var p3 = (a1*c2-b1*d2+c1*a2+d1*b2)
            var p4 = (a1*d2+b1*c2-c1*b2+d1*a2)

            return Cuaternion(p1,p2,p3,p4)
        }
        
        return Cuaternion(0.0,0.0,0.0,0.0)
    }

    operator fun unaryMinus() : Cuaternion {
        var c = Cuaternion(this.cuat[0],-this.cuat[1],-this.cuat[2],-this.cuat[3])

        return c
    }

    operator fun not() : Double {
        var p1 = this.cuat[0].pow(2) 
        var p2 = this.cuat[1].pow(2) 
        var p3 = this.cuat[2].pow(2) 
        var p4 = this.cuat[3].pow(2)
        var p = p1 - p2 - p3 - p4
        var m = sqrt(p)
        
        return m
    }

    override fun toString() : String {
        var imprimir = "(${this.cuat[0]} + ${this.cuat[1]}i + ${this.cuat[2]}j + ${this.cuat[3]}k"

        return imprimir
    }
    
}