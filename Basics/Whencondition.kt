fun main() {

    println("enter your age ")
    val age = readLine()?.toInt()
    val x = 5
    when (age) {
        in 0..5 -> {
            println("you are a young kid")
            println("for printing another line")
        }
        //for more print line  we have make {} for that


        in 6..17 -> println("you are teenager")


        18 -> if (x == 5) {
            println("finally!1 you are 18 now")
        }   //if we have make more condition so we write if condaiton for that


        19, 20 -> println("you are a young adult")
        in 21..65 -> println("you are an adult")
        in 65..100 -> println("you are really old ")
    }
}