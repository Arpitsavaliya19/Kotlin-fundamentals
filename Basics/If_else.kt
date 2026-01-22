fun main() {

    val x = 5
    val y = 6
    val z =
        if (x + y == 10) 4 else 5 // here in kotlin we can assign the value of the variable based on the if condition

    if (x < y) {
        println("x is smaller then y")
    } else if (x > y) {
        println("x is grater then y ")
    }
    println("this is always be executed and the value of the z is : $z")
}