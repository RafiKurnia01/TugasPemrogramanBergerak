package src

fun main() {
    val product = Product("Indomie", 3000, "Food")
    val product2 = product.copy(name = "Supermie")
    println(product)
    println(product2)
}