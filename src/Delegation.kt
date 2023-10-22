package src

fun main() {
    val base = MyBase()
    base.sayHello("Ecok")

    val baseDelegate = MyBaseDelegation(base)
    baseDelegate.sayHello("Supraman")
    baseDelegate.sayGoodBye("Soimah")
}