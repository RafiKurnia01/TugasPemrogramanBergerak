package src

open class Shape {
    open val corner: Int = -1
    open fun printName(){
        println("This is shape")
    }
}

class Rectangle: Shape(){
    override val corner: Int = 5
    val parentCorner : Int = super.corner
    override fun printName(){
        println("This is rectangle")
        super.printName()
    }
}

class Triangle: Shape(){
    override val corner: Int = 3
}