fun main (){
    search("how to became good programer")
    search("new game","on yahoo!")
}

fun search(search: String , searchengine: String = "google "){ // we can pass a default arguments inn the function

    println("searchoing for $search on $searchengine" )
}