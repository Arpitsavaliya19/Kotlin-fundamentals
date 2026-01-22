fun main (){


    var power = printPower(3,4)
    println("3 to the power 4 is : $power")
    printPower(exponent = 4, base = 5)  // use of perameter  unorder wise

}





// to return value write the end of the perameter peranthisis return  type
// aslo we write basic logic be side of perameter  like ex: fun multiplication(a:Int,b:Int) = a*b{} this in also work
// for passing the list in the function we should  list insted of the listof(_) finction



fun printPower(base : Int , exponent : Int ) : Int{     // we can also use perameter in diffrent order
    var result = 1
     for(i in 1..exponent){
         result*=base
    }
    return result
}


fun printLine(){
    println("hello guys this is function for printing the lines")

}