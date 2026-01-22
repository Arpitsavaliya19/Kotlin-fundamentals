fun main() {
    /*var list = (1..20).toList()
    println(list)*/


    //lambda function is always be in curly bracket so you can easily identify it.
    // here the filter function is  filter the list
    /*val sum = list.customSum { it % 2 == 1 }// here this is filter the odd number and keep that in the list
    println("Sum of odd number $sum")*/


    // here the triple is generic function that take any type of the input
    val customtriple = coustomTriple<Int, String, Boolean>(3, "arpit", true)
    customtriple.printTypes()
}
// for generacis