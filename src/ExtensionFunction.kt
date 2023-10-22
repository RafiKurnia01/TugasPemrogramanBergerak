package src

fun main() {
    val student = Stundents("Rafi", 21)
    student.sayHello("Joko")
    println(student?.upperName)
}