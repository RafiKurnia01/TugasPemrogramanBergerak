package src

class Person {
    var firstname: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String){
        println("Hello $name, My name is $firstname")
    }

    fun sayHello(firstname:String, lastName:String){
        println("Hello $firstname $lastName, My name is ${this.firstname}")
    }

    fun run(){
        println("I'm Run")
    }

    fun getFullName(): String{
        return "$firstname $middleName $lastName"
    }
}