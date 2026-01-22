


// here we make an coustom triple function that print the type of the triple elements
//here any that also accept the null value
class coustomTriple<A: Any,B: Any,C: Any> (
    val first : A,
    val second : B,
    val third : C
){
    fun printTypes() {
        println("the type of the first is ${first::class}")
        println("the type of the second is ${second::class}")
        println("the type of the third is ${third::class}")
    }

}