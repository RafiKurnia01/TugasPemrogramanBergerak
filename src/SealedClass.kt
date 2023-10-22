package src

fun operation(value1 : Int, value2 : Int, operation : Operation): Int{
    return when(operation){
        is plus -> value1 + value2
        is minus -> value1 - value2
        is modulo -> value1 % value2
    }
}

fun main() {
    println(operation(12, 14, plus()))
    println(operation(10, 6, minus()))
    println(operation(34, 14, modulo()))
}