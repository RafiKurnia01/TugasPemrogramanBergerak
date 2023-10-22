package src

fun main() {
    val aku = Person()
    aku.firstname = "Rafi"
    aku.middleName = "Kurnia"
    aku.lastName = "Ilahi"

    aku.sayHello("Ucok")
    aku.run()
    val fullname = aku.getFullName()
    println("fullname")
}