package src

enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescription(){
        println("Descriptions")
    }
}