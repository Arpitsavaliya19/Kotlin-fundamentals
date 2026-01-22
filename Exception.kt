import java.lang.Exception

fun main() {
    println("enter `input")


    /*for handle exception need to use try and catch,try block throws an exception and catch block is handle
        exception*/

    // here try block is throw number formate exception
   /* try {
        val input = readLine()?.toInt()

 //in the catch block we write exception so then that catch block handle all type of exception
    } catch (e: NumberFormatException) {
        0
    } finally {    // here the finally block alwsy be ececuted in case of exception accrue or not accrue
        println("this is always be execute")
    }*/



    try {
        val division = devide(5.0, 0.0)
    } catch (e:DivisibleByZero) {
        println("please choose the different number")
        0
    }

}


/*making our own exception
for creating our own exception we need to create the class that name is exception name as which we want to create*/



class DivisibleByZero : Exception("You can not divide by zero please choose the diffreant number")

fun devide (a: Double,b: Double): Double {

    if (b==0.0) {
        throw DivisibleByZero()
    }
    return a/b
}
