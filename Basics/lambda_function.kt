//concept of the lambda function is passing the function in function

fun main() {
    var list = (1..20).toList()
    println(list)


    //lambda function is always be in curly bracket so you can easily identify it.
    // here the filter function is  filter the list
    val sum = list.customSum{it%2==1}// here this is filter the odd number and keep that in the list
    println("Sum of odd number $sum")
}



// we created userdefine filter function that gives same output as the kotlin in built filter function

//  here is the how to make user define lambda function
//in the () we have to tell kotlin which function we pass here
// for the return type in filter function we need to do-> instead of the : here

/*fun List<Int>.customFilter(filterFunction: (Int) -> (Boolean)): List<Int> {
    val resultlist  = mutableListOf<Int>()
    for (Int in this ) {
        if (filterFunction(Int,)) {
            resultlist.add(Int)
        }
    }
    return resultlist
}*/

fun List<Int>.customSum(filterFunction: (Int) -> (Boolean)): Int {
    var sum = 0
    for (ele in this ) {
        if (filterFunction(ele)) {
            sum+=ele
        }
    }

    return sum

}
//_____________________________________________________________________________________________________________________


/*
Generic in Kotlin allows you to write classes, interfaces, and functions that can work with any data type
(Int, String, User, etc.) without specifying it in advance.*/

// here if we write the <t insted of the  Int in upper function that function noe accept any data type>
