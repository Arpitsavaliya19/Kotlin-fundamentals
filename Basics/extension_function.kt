fun main(){

    println("enter nymber to check for prime or not")
    var input = readln()?.toInt()
    if (input!= null){
        if (input.checkifprime()){
            println("$input is a prime number")
        }
        else {
            println("$input is not a prime number")
        }
    }

}

fun Int.checkifprime() : Boolean{

    for (i in 2 until this-1){   // if we want to use the main function variable then we are to use this keyword
        if (this%i==0){
            return true
        }
    }
    return false
}



