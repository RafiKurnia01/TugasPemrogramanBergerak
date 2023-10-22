package src

class Stundents(val name: String, val age:Int)

fun Stundents?.sayHello(name:String){
    if(this != null){
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }
}

val Stundents.upperName: String
    get() = this.name.toUpperCase()
