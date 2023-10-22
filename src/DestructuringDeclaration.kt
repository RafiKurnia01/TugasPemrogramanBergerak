package src

fun minmax(value1: Int, value2: Int) : MinMax{
    return when{
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean{
    return callback(login)
}

fun main() {
    val game = Game("Game Kotlin", 100000)
    val (name, price) = game

    println(name)
    println(price)

/*    val result = minmax(10, 100)
    val min = result.min
    val max = result.max*/

/*    val (min, _) = minmax(10, 100)
    println(min)*/

    val (min, max) = minmax(10, 100)
    println(min)
    println(max)

    val login = Login("Rafi", "rahasia")
    /*login(login){login ->
        login.name == "Rafi" && login.pass == "rahasia"

    }*/

    login(login){ (username, password) ->
        username == "Rafi" && password == "rahasia"
    }
}