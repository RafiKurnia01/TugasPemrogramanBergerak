package src

import src.Car

fun main(){
    val avanza = Car("Toyota")
    avanza.year = 2015
    var almaz = Car("Wuling")

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)


}
