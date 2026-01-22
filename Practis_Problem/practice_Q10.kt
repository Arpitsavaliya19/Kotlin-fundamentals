fun main() {
    val l = listOf(1, 4, 7, 0, 4, 2)
    val arr = arrayOf(3, 2, 9, 8, 5, 7)

    printalter(arr)

}

//--> at any tupe of list or in the array for alternating ittaration use toggle

fun printalter(list: List<Int>) {

    var i = 0
    var j = list.size - 1
    var toggle = true

    while (i <= j) {

        if (toggle) {
            println(list[i])
            i++
        } else {
            println(list[j])
            j--
        }
        toggle=!toggle
    }
}

fun printalter(array: Array<Int>) {

    var i = 0
    var j = array.size - 1
    var toggle = true

    while (i <= j) {

        if (toggle) {
            println(array[i])
            i++
        } else {
            println(array[j])
            j--
        }
        toggle=!toggle
    }
}
