package src

fun printObject(any: Any){
    if(any is Laptop){
        println("Laptop with name ${any.name}")
    }else if(any is HandPhone){
        println("HandPhone with name ${any.name}")
    }else{
        println(any)
    }
}

fun printObjectWithWhen(any: Any){
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("HandPhone with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any){
    val value: String? = any as? String
    println(value)
}



fun main(){
    //printString(1)

    printObjectWithWhen("Rafi")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(HandPhone("Samsung"))

}