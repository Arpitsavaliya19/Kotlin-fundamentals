//

fun main(){
    println("Plase enter your age")

    val age = readLine()
    if(age!=null ) {
        if (age.toInt() > 18) {
            println("you are an adult")
        }
        else {
            println("you are a teenager")
        }
    }
    else {
        println("the input is null")
    }
}