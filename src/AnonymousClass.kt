package src

fun fireAction(action : Action){
    action.action()
}

class sampeAction : Action{
    override fun action() {
        println("Ini adalah contoh Action")
    }
}

fun main() {
    fireAction(sampeAction())
    fireAction(object : Action{
        override fun action() = println("Action one")
        })
}