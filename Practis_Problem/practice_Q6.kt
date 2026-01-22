fun main() {
    var index = searchInList()
    if (index != null) {
        println("you searched element id found at index :$index")
    }
}

fun searchInList(): Int? {

    println("enter the size of th list")

    var n = readln()?.toInt()

    var list = mutableListOf<Int>()

    for (i in 1..n!!) {

        var x = readLine()?.toInt()
        if (x != null) {
            list.add(x)

        }
    }
    println("enter ele for searching list")

    var search = readln()?.toInt()

    for (i in list[0]..list.size - 1) {

        if (list[i] == search) {
            return i
        }
    }

    return null
}

