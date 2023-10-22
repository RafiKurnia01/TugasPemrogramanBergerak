package src

import src.Person

fun main(){
    val aku = Person()
    aku.firstname = "Rafi"

    val ayang = Person()
    ayang.firstname = "Putri"

    println(aku.firstname)
    println(ayang.firstname)
}