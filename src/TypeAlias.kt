package src

typealias App = Application
typealias aplikasi = App
typealias stringSupplier = () -> String

fun sayHello(supplier: stringSupplier){
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = aplikasi("Kotlin App")
    sayHello { "ucok" }
}