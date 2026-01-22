fun main (){

    val sum = alternativesum(1,54,7,9,0,34,7,7)

    println("the alternative sum of the your numbers is $sum")

}

fun alternativesum(vararg  number : Int): Int {

    var sum = 0
    for (i in number.indices) {

        if (i%2==0){
            sum = sum - number[i]
        }
        sum = sum + number[i]
    }
    return sum
}