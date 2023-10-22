package src

class Bos(val bossname:String) {
    inner class Employee(val name: String){
        fun hi(){
            println("Hi, my name is $name, and my boss name is $bossname")
        }
    }
}