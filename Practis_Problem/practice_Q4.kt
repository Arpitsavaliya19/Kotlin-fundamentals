fun main(){


    println("Enter thew number to print fibonachhi series untill this number")

    var fib = 0
    val n = readln()?.toInt()
    val list = mutableListOf<Int>()

        if (n!= null) {
            for (i in 0..n) {
                fib = fib + i
                list.add(fib)
            }
        }
    println(list)
}
