package src

fun main() {
    var user1 = User("Rafi", "12345")
    var user2 = User("Ila", "54321")

    println(user1.usernameParam)
    println(user1.passwordParam)

    println(user2.usernameParam)
    println(user2.passwordParam)
}