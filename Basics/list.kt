fun main (){


    //val list  = listOf(1,2,5)  //list is immutable ,but we can change the that by using the mutable list function

//    val list = mutableListOf(1,4,2,56,7,3)
//    list.add(34)
//
//    println(list)   // we can simple print the list direct using the println function
//
//    list.remove(4)
//    println(list)
//
//    list.removeAt(2)
//    println(list)



    //here this function of the list is convert range in the list that we have to define before tolist function
    val LIST = (1..10).toList()

    println("Enter the number of the list")

    val list  = mutableListOf<Int>()
    for(item in 1..5) {
        val x = readLine()?.toInt()
        if (x!= null){
            list.add(x)
        }
    }

    for (i in 4 downTo 0){
        println(list[i])
    }
}

