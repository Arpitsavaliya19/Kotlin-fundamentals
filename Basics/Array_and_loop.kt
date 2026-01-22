fun main (){

    val a1= arrayOf(1,4,2,7,9,3)
    var arraylength = a1.size

    var i = 0

    while(i<arraylength) {
        println(a1[i])
        i++
    }

    // here in kotlin we simply write for loop like this
    // for(i in a){}  here a is an array


    val a = arrayOf(1,4,2,5)

    for (i in a) {  // here i is an element it's self not an index of the array of list of vararg
        //here we take a because of array that we declare but in other case we simply write range of the loop
        // for reverse order it has downto
        println(i)
      // if we have the calculation in our range son we should right until keyword in the between the range
    }
        println()

    for (i in 3 downTo 1){ // for increase stepwise like 1 step or 2 step
        println(i)
    }
    println("******")
    for (i in 10 downTo 2 step 2){ // for increase stepwise like 1 step or 2 step
        println(i)
    }
    println("******")
    for (i in 'a'..'z'){ // for increase stepwise like 1 step or 2 step
        println(i)
    }
    println("******")
}

