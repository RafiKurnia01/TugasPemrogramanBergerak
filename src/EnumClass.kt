package src

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allgenders: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allgenders.toList())

    man.showDescription()
    woman.showDescription()
}