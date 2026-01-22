class rectangle(

    val a: Double, val b: Double

) : shape(name = "ractangle") {      // here we inherit the class which name is shape
    init {
        println("$name is created where a=$a and b =$b")
    }

    fun area() = a * b

    fun ifsqare() = a == b

}