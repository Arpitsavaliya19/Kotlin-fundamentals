fun main(){

     var ans = productoflist()

    println("product of the list is :$ans")

}

fun productoflist(): Int{

    println("enter element of the list ")
    var n = readLine()?.toInt()
    var list = mutableListOf<Int>()
    if (n!=null) {
        for (i in 1..n) {
            var x = readLine()?.toInt()
            if (x != null) {
                list.add(x)
            }
        }
    }

    var mul = 1
    for (i in list){
        mul*=i
    }
    return mul
}