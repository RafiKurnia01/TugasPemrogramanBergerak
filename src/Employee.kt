package src

open class Employee(val name: String) {
    open fun sayHello(name:String){
        println("Hello $name, My name is ${this.name}")
    }
}

class Manager(name:String) : Employee(name){
    final override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
}

/*class SuperManager(name :String) : Manager(name){
    override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
}*/
class videPresident(name: String) : Employee(name){
    final override fun sayHello(name: String) {
        println("Hello $name, My name is vicePresident ${this.name}")
    }
}