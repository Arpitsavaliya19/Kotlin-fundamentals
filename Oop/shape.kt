open class shape(       // for inherite the class we should write after the class constructure
                        //  : and write the class name with it's constuctor
    var name: String
) {
    init {
        println(" i am the super class")
    }

    fun changename(newname: String) {
        println("name has been changed and new name is :$newname")
    }
}

