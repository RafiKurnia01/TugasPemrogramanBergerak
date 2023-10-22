package src

class Car (paramBrand: String,paramName: String, paramYear: Int){

    init{
        println("car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2020){
        println("Secondary constructor 1")
    }
    constructor(paramBrand: String) : this(paramBrand, ""){
        println("Secondary constructor 2")
    }

    var brand: String = paramBrand
    var name : String = paramName
    var year: Int = paramYear


}