package src

abstract class Animal {
    abstract val name :String
    abstract fun run()
}

class Cat : Animal(){
    override val name: String = "cat"
    override fun run(){
        println("Cat run")
    }
}

class Dog : Animal(){
    override val name: String = "dog"
    override fun run() {
        println("Dog run")
    }
}