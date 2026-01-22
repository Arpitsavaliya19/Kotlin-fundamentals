//fun main() {

//    val array  = arrayOf(1,3,5,9,0,2)
//    var max  =array[0]
//
//    for (i in array){
//        if (i>max){
//            max = i
//        }
//    }


//    println("Your maximum numer in the array is : $max")
//    val arr = arrayOf(1,4,6,2,8)
//    var sum  = 0
//
//    for (i in arr){
//        sum = sum + i
//    }
//    println("The sum of the all number in array is : $sum")

fun main() {

    println("enter 5 numbers")

    var avg = 0.0

    for (i in 1..5) {
        val num = readLine()?.toInt()
        if (num != null) {
            avg += num / 5.0
        }
    }
    println("avg of all number is : $avg")
}

