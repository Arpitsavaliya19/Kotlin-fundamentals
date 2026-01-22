fun main(){

 findSumTillNum(4)

}

fun findSumTillNum(num : Int){

    var sum = 0
     for (i in 1..num){
         sum+=i
     }
    println("sum of all number till the $num is : $sum")
}