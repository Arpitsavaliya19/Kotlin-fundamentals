import kotlin.math.max

fun  main(){

    var array  = intArrayOf(10,34,99)  // we can also create vararg array

    val max = getmax(2,54,*array,1,22,9,0)  // we can also pass an array in the vararg type function or a
                                                       // variable   here this the example of the passing arrray or
                                                       // argument in the variable

    println("the maximum number is $max")
}

fun getmax(vararg numbers:Int): Int {

    var max  = numbers[0]
     for(num in numbers){
         if(num>max){
            max = num
         }
     }
    return max

}